package com.example.infomovie.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.example.infomovie.ListAdapter;
import com.example.infomovie.R;
import com.example.infomovie.model.ListElement;

import java.util.ArrayList;


public class NowPlaying extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    ArrayList<ListElement> listMovie;
    RecyclerView recyclerView;

    private String mParam1;
    private String mParam2;

    public NowPlaying() {
        // Required empty public constructor
    }


    public static NowPlaying newInstance(String param1, String param2) {
        NowPlaying fragment = new NowPlaying();
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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.now_playing_movie, container, false);
        init();
        recyclerView = rootView.findViewById(R.id.now_playing_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        ListAdapter adapter = new ListAdapter(listMovie, getContext());
        recyclerView.setAdapter(adapter);


        return rootView;
    }

    public void init() {
        listMovie = new ArrayList<>();
        String[] titles = {
                "Fall",
                "Bullet Train",
                "La Máquina infernal",
                "Atenea",
                "La Bestia",
                "After. Amor infinito",
                "Smile",
                "Persecución mortal",
                "Liga de supermascotas",
                "Dragon Ball Super: Super Hero",
                "La pasajera",

        };
        Double[] rating = {

                7.4,
                7.5,
                6.8,
                6.6,
                7.1,
                6.9,
                6.9,
                4.8,
                7.5,
                8.0,
                5.0,
        };
        String[] releaseDate = {
                "2022-08-11",
                "2022-07-03",
                "2022-09-23",
                "2022-09-09",
                "2022-08-11",
                "2022-08-24",
                "2022-09-23",
                "2022-08-19",
                "2022-07-27",
                "2022-06-11",
                "2022-08-31",
        };
        String[] imagePath = {

                "/tsjVxiuGyvMC4IbI2gjmDYpcYjU.jpg",
                "/ybSIUt48PsM08F4UZwHdjL9ZVG2.jpg",
                "/7VuQopunJnHKI1xejbdRUyDbP0S.jpg",
                "/uponqptyKtBsJuODqmxoronFd8P.jpg",
                "/lGIkv9fQ3i7yVcJXDvG0Vry00LI.jpg",
                "/6b7swg6DLqXCO3XUsMnv6RwDMW2.jpg",
                "/qJO54b6LsBmEkMxdW8ZziL9Mnam.jpg",
                "/iRbaEeasR06mftDlA0cOy6NAvuk.jpg",
                "/lDtANZzTD80bVi1DTRKRVDrurhJ.jpg",
                "/uohymzBVaIYjbnoQstbnlia6ZPJ.jpg",
                "/3Oi2xIzQ8c4AYJah229zAMqSfQp.jpg",
        };

        String[] overView = {

                "Para las mejores amigas Becky y Hunter, la vida trata de superar tus miedos y empujar tus límites. Sin embargo, después de subir hasta la cima de una torre de comunicaciones abandonada, se encuentran atrapadas y sin forma de bajar. A 600 metros del suelo y totalmente alejadas de la civilización, las chicas pondrán a prueba sus habilidades de escaladoras expertas y lucharán desesperadamente por sobrevivir aunque lo tengan todo en contra. ¿Lo conseguirán?",
                "Cinco asesinos a sueldo se encuentran a bordo de un tren bala que viaja de Tokio a Morioka con unas pocas paradas intermedias. Descubren que sus misiones no son ajenas entre sí. La pregunta es quién saldrá vivo del tren y qué les espera en la estación final.",
                "Bruce Cogburn, un autor controversial y solitario, sale de su escondite al recibir numerosas cartas de un fanático obsesivo. Se trata tan solo del comienzo de un espiral de peligro y misterio.",
                "Horas después de la trágica muerte de su hermano menor en circunstancias inexplicables, la vida de tres hermanos se ve sumida en el caos.",
                "El Doctor Nate Samuels, que se ha quedado viudo recientemente, regresa a Sudáfrica, lugar en el que conoció a su mujer, para visitar una reserva de animales con sus hijas. Pero lo que empieza siendo un viaje curativo se convierte en una lucha por la supervivencia cuando un león que ha escapado de unos cazadores furtivos empieza a seguirles.",
                "El amor de Tessa y Hardin nunca ha sido fácil. Mientras él permanece en Londres después de la boda de su madre y se hunde cada vez más en su propia oscuridad, ella regresa a Seattle. Tessa es la única capaz de entenderle y calmarle... él la necesita, pero ella ya no es la chica buena y dulce que era cuando llegó a la universidad. Deberá plantearse si lo que debe hacer ahora es salvar a Hardin y su relación con él, o si ha llegado el momento de pensar solo en ella. Si quieren que su amor sobreviva, primero tendrán que trabajar en sí mismos. ¿Pero será su destino seguir estando juntos?",
                "Tras presenciar un extraño y traumático incidente con un paciente, la doctora Rose Cotter (Sosie Bacon) comienza a experimentar sucesos aterradores que no puede explicar. A medida que un miedo sobrecogedor comienza a afectar a todos los aspectos de su vida, Rose se verá obligada a afrontar a su problemático pasado para sobrevivir y escapar de su terrorífica nueva realidad.",
                "El ladrón lleva a cabo el robo de su vida cuando roba al psicótico señor de la droga, Temple. El plan se lleva a cabo sin problemas hasta que el ladrón descubre un polizón en su coche de huida: la esposa embarazada de Temple, Mia. Con Temple y su mejor asesino, el francés, en plena persecución, el ladrón se debate entre emprender una rápida huida o dar un arriesgado rodeo para ayudar a Mia a escapar de las garras de su marido. En cualquier caso, su única posibilidad de escapar con vida es conducir.",
                "Krypto el Superperro y Superman son amigos inseparables que comparten los mismos superpoderes y luchan juntos contra el crimen en Metrópolis. Cuando Superman y el resto de la Liga de la Justicia son secuestrados, Krypto debe convencer a un variopinto grupo de un albergue –Ace el sabueso, PB la cerdita barrigona, Merton la tortuga y Chip la ardilla– de dominar sus nuevos poderes y ayudarlo a rescatar a los superhéroes.",
                "Son Goku destruyó en su momento al Ejército Red Ribbon. Ahora, ciertos individuos han decidido continuar con su legado y han creado a los androides definitivos: Gamma 1 y Gamma 2. Estos dos androides se autoproclaman \"superhéroes\" y deciden atacar a Piccolo y a Gohan. ¿Cuál es el objetivo del Nuevo Ejército Red Ribbon?  Ante un peligro inminente, ¡llega el momento del despertar del Superhéroe!",
                "Tres ladrones se hacen con el yate de lujo de una mujer fiestera, quién lucha por sobrevivir después de los hechos.",
        };
        for (int i = 0; i < titles.length; i++) {
            listMovie.add(new ListElement(titles[i], rating[i], releaseDate[i], "https://image.tmdb.org/t/p/original/" + imagePath[i]));
        }

    }
}
