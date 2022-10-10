package com.example.infomovie.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.infomovie.ListAdapter;
import com.example.infomovie.R;
import com.example.infomovie.model.ListElement;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class PopularMovie extends Fragment {

    List<ListElement> element;
    RecyclerView recyclerView;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    public PopularMovie() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static PopularMovie newInstance(String param1, String param2) {
        PopularMovie fragment = new PopularMovie();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        init();

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(
                R.layout.popular_movie_list, container, false);


        init();
        recyclerView = rootView.findViewById(R.id.popular_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        ListAdapter adapter = new ListAdapter(element, getContext());
        recyclerView.setAdapter(adapter);

        return rootView;


    }

    private void init() {
        element = new ArrayList<>();

        String[] titles = {
                "El retorno de las brujas 2",
                "Fall",
                "Bullet Train",
                "La Máquina infernal",
                "Atenea",
                "Lou",
                "Fullmetal Alchemist: La alquimia final",
                "Pinocho",
                "La Bestia",
                "After. Amor infinito",
                "Thor: Love and Thunder",
                "Smile",
                "Predator: La presa",
                "Persecución mortal",
                "Liga de supermascotas",

        };
        Double[] rating = {
                7.8,
                7.4,
                7.5,
                6.8,
                6.6,
                6.5,
                6.9,
                6.7,
                7.1,
                6.9,
                6.8,
                6.9,
                7.9,
                4.8,
                7.5,};
        String[] releaseDate = {"2022-09-27",
                "2022-08-11",
                "2022-07-03",
                "2022-09-23",
                "2022-09-09",
                "2022-09-23",
                "2022-06-24",
                "2022-09-07",
                "2022-08-11",
                "2022-08-24",
                "2022-07-06",
                "2022-09-23",
                "2022-08-02",
                "2022-08-19",
                "2022-07-27",
        };
        String[] imagePath = {
                "/t7CKYUNVdJePAfhvwSqlp4vsX68.jpg",
                "/tsjVxiuGyvMC4IbI2gjmDYpcYjU.jpg",
                "/ybSIUt48PsM08F4UZwHdjL9ZVG2.jpg",
                "/7VuQopunJnHKI1xejbdRUyDbP0S.jpg",
                "/uponqptyKtBsJuODqmxoronFd8P.jpg",
                "/djM2s4wSaATn4jVB33cV05PEbV7.jpg",
                "/mQQXEMsukZ2Okd98LCrL33q7tFH.jpg",
                "/1yIM2QL0qLzWMjTGuMX12yZnBtb.jpg",
                "/lGIkv9fQ3i7yVcJXDvG0Vry00LI.jpg",
                "/wZwxopzmqOBmS44Y2q4LUsOiFTC.jpg",
                "/z9ajF6E39Hg2pXUofmUYgZHvdX.jpg",
                "/qJO54b6LsBmEkMxdW8ZziL9Mnam.jpg",
                "/sNAMqQ9T7YnXnvUSufeWzaRgK6Y.jpg",
                "/iRbaEeasR06mftDlA0cOy6NAvuk.jpg",
                "/lDtANZzTD80bVi1DTRKRVDrurhJ.jpg",
        };

        String[] overView = {
                "Han pasado 29 años desde que alguien encendió la Vela de la Llama Negra y resucitó a las hermanas Sanderson del siglo XVII, y ahora buscan venganza. De tres estudiantes de secundaria depende impedir que las voraces brujas causen un nuevo tipo de estrago en Salem antes del amanecer el día de Halloween.",
                "Para las mejores amigas Becky y Hunter, la vida trata de superar tus miedos y empujar tus límites. Sin embargo, después de subir hasta la cima de una torre de comunicaciones abandonada, se encuentran atrapadas y sin forma de bajar. A 600 metros del suelo y totalmente alejadas de la civilización, las chicas pondrán a prueba sus habilidades de escaladoras expertas y lucharán desesperadamente por sobrevivir aunque lo tengan todo en contra. ¿Lo conseguirán?",
                "Cinco asesinos a sueldo se encuentran a bordo de un tren bala que viaja de Tokio a Morioka con unas pocas paradas intermedias. Descubren que sus misiones no son ajenas entre sí. La pregunta es quién saldrá vivo del tren y qué les espera en la estación final.",
                "Horas después de la trágica muerte de su hermano menor en circunstancias inexplicables, la vida de tres hermanos se ve sumida en el caos.",
                "El largo y tortuoso viaje de los hermanos Elric llega a su épico final, en el que deben enfrentar una amenaza de otro mundo que afecta a todo el país.",
                "Versión en acción real del aclamado cuento sobre una marioneta que se embarca en una trepidante aventura para convertirse en un niño de verdad. La historia también presenta a otros personajes, como Gepetto, el carpintero que fabrica a Pinocho y lo trata como a su propio hijo; Pepito Grillo, que hace las veces de guía y “conciencia” de Pinocho; el Hada Azul; el Honrado Juan; la gaviota Sofía, y el cochero.",
                "El Doctor Nate Samuels, que se ha quedado viudo recientemente, regresa a Sudáfrica, lugar en el que conoció a su mujer, para visitar una reserva de animales con sus hijas. Pero lo que empieza siendo un viaje curativo se convierte en una lucha por la supervivencia cuando un león que ha escapado de unos cazadores furtivos empieza a seguirles.",
                "El Dios del Trueno emprende un viaje que no se parece en nada a lo que se ha enfrentado hasta ahora: una búsqueda de la paz interior. Pero el retiro de Thor se ve interrumpido por un asesino galáctico conocido como Gorr el Carnicero de Dioses. Para hacer frente a la amenaza, Thor solicita la ayuda de Valkiria, de Korg y de su ex novia Jane Foster que, para sorpresa de Thor, empuña su martillo mágico, Mjolnir, como la Poderosa Thor. Juntos, se embarcan en una aventura cósmica en la que tendrán que descubrir el misterio de la venganza del Carnicero de Dioses y detenerlo antes de que sea demasiado tarde.",
                "Tras presenciar un extraño y traumático incidente con un paciente, la doctora Rose Cotter (Sosie Bacon) comienza a experimentar sucesos aterradores que no puede explicar. A medida que un miedo sobrecogedor comienza a afectar a todos los aspectos de su vida, Rose se verá obligada a afrontar a su problemático pasado para sobrevivir y escapar de su terrorífica nueva realidad.",
                "Ambientada hace 300 años en la Nación Comanche. Naru es una joven guerrera, feroz y altamente hábil, que se crió a la sombra de algunos de los cazadores más legendarios que deambulan por las Grandes Llanuras. Cuando el peligro amenaza su campamento, se dispone a proteger a su gente. La presa a la que acecha y, en última instancia, se enfrenta, resulta ser un depredador alienígena evolucionado con un arsenal técnicamente avanzado, lo que deriva en un enfrentamiento cruel y aterrador entre los dos adversarios.",
                "Krypto el Superperro y Superman son amigos inseparables que comparten los mismos superpoderes y luchan juntos contra el crimen en Metrópolis. Cuando Superman y el resto de la Liga de la Justicia son secuestrados, Krypto debe convencer a un variopinto grupo de un albergue –Ace el sabueso, PB la cerdita barrigona, Merton la tortuga y Chip la ardilla– de dominar sus nuevos poderes y ayudarlo a rescatar a los superhéroes.",
        };
        for (int i = 0; i < titles.length; i++) {
            element.add(new ListElement(titles[i], rating[i], releaseDate[i], "https://image.tmdb.org/t/p/original/" + imagePath[i]));
        }
    }

}