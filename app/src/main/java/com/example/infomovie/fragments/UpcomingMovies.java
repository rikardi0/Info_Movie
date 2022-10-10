package com.example.infomovie.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.infomovie.ListAdapter;
import com.example.infomovie.R;
import com.example.infomovie.model.ListElement;

import java.util.ArrayList;
import java.util.List;


public class UpcomingMovies extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    List<ListElement> listUpcoming;
    RecyclerView recyclerView;


    private String mParam1;
    private String mParam2;

    public UpcomingMovies() {

    }


    public static UpcomingMovies newInstance(String param1, String param2) {
        UpcomingMovies fragment = new UpcomingMovies();
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

        View rootView = inflater.inflate(R.layout.fragment_upcoming_movies, container, false);
        init();
        recyclerView = rootView.findViewById(R.id.upcoming_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        ListAdapter adapter = new ListAdapter(listUpcoming, getContext());
        recyclerView.setAdapter(adapter);


        return rootView;
    }


    public void init() {
        listUpcoming = new ArrayList<>();
        String[] titles = {"Jeepers Creepers: Reborn",
                "X",
                "Black Adam",
                "En Lo Profundo",
                "Tenor",
                "Halloween: El final",
                "Tadeo Jones 3: La tabla esmeralda",
                "ONE PIECE FILM RED",
                "Un héroe samurai: La leyenda de Hank",
                "Declaración de emergencia",
                "Hombres al borde de un ataque de nervios",
                "Esperando a Mister Bojangles",
                "No te preocupes querida",
                "La Mujer Rey",
                "Hopper, el polloliebre",
                "Buena suerte, Leo Grande",
                "Todo a la vez en todas partes",
                "Barbarian",
                "Viaje al paraiso",
        };
        Double[] rating = {
                5.8,
                6.8,
                0.0,
                6.7,
                7.1,
                7.3,
                7.1,
                7.5,
                6.7,
                6.9,
                5.6,
                7.6,
                6.8,
                7.1,
                7.4,
                7.0,
                8.2,
                7.2,
                6.7,
        };
        String[] releaseDate = {"2022-09-15",
                "2022-03-17",
                "2022-10-19",
                "2022-08-26",
                "2022-05-04",
                "2022-10-12",
                "2022-08-24",
                "2022-08-06",
                "2022-07-14",
                "2022-08-03",
                "2022-02-10",
                "2022-01-05",
                "2022-09-21",
                "2022-09-15",
                "2022-02-16",
                "2022-06-17",
                "2022-03-24",
                "2022-09-08",
                "2022-09-08",
        };
        String[] imagePath = {
                "/aGBuiirBIQ7o64FmJxO53eYDuro.jpg",
                "/4pCSBPHUPia93rppHF3UX4cLQ9M.jpg",
                "/mPTzXksC8HcAj6EM6WjZFJVJEzF.jpg",
                "/wvIPVmGIJ8RqPS6NVbEeYX9K0gf.jpg",
                "/oKy8d4CMqD5bZhZs6b775PcxpC3.jpg",
                "/tQstTS2Q3ZaeWu3fsGDDIr0EBnW.jpg",
                "/nqj1AVa6Le76wvjRYqn5T4XiDYI.jpg",
                "/wwwBQK45qSedBdgQGuJXdwJOQE2.jpg",
                "/dcccakIsT9rBE3EH1f38JMqtgYw.jpg",
                "/uqd0w7sevlyBgcIAX1qg8LjsHFM.jpg",
                "/aIeYmoVssfMkcJxnWwUJGSKtm1D.jpg",
                "/l4giD7V9Nj62Y5JN8I5ZuaNbPQD.jpg",
                "/z9ZulBDrSBeQN8cagY73lIzr2uh.jpg",
                "/g7H3cg6aM11JOdlOLqaUp4BmMvM.jpg",
                "/cg7E2WGLEXB7n45jmW5daQl51VH.jpg",
                "/m84Qa4lsS3Hf1I8OR4WBs8N5pT1.jpg",
                "/ildVXPXTQFly8VAgIrre5v5rbbQ.jpg",
                "/mMB9M9HsBB4XAep9rTvKyDETVxm.jpg",
                "/c1zit9bUtEe6yjcIEtdVQ9mJpp8.jpg",
        };

        String[] overView = {
                "El Horror Hound festival celebra su primer evento en Luisiana, donde atrae a cientos de fanes del terror; entre ellos se encuentra Laine que, obligada a asistir por Chase, su novio, comienza a experimentar premoniciones inexplicables y visiones inquietantes relacionadas con el pasado de la ciudad y con El Creeper. A medida que avanza el festival y el entretenimiento empapado de sangre se convierte en un frenesí, Laine cree que algo sobrenatural ha sido convocado y que ella está en el centro de todo",
                "En 1979, un grupo de jóvenes cineastas se propusieron hacer una película para adultos en la zona rural de Texas, pero cuando sus anfitriones solitarios y ancianos los atrapan en el acto, el elenco pronto se encuentra en una lucha desesperada por sus vidas.",
                "Casi 5.000 años después de haber sido dotado de los poderes omnipotentes de los antiguos dioses -y encarcelado con la misma rapidez-, Black Adam es liberado de su tumba terrenal, listo para desatar su forma única de justicia en el mundo moderno.",
                "Mientras trabaja a tiempo parcial como repartidor de sushi, Antoine, un joven aspirante a rapero de los suburbios de París, conoce a la Sra. Loiseau, una eminente profesora de la Ópera de París. Asombrada por el talento del joven, ella lo introduce en el mundo de la ópera y le ofrece un puesto como alumno suyo. Temiendo que no le entiendan, Antoine, lo oculta a sus amigos y familiares pero esta doble vida lo agobia... En algún lugar entre la dorada y encorsetada clase alta parisina, y los duros suburbios en los que creció, Antoine tendrá que encontrar su propia voz.",
                "Cuatro años después de los eventos de Halloween en 2018, Laurie ha decidido liberarse del miedo y la ira y abrazar la vida. Pero cuando un joven es acusado de matar a un niño que estaba cuidando, se enciende una cascada de violencia y terror que obligará a Laurie a enfrentarse finalmente al mal que no puede controlar, de una vez por todas.",
                "Sigue a una mujer desesperada por escapar de su pueblo, conoce a un extraño que le promete una escapada romántica, pero resulta en engaño, desconfianza y violencia.",
                "Uta — la cantante más querida del mundo. Su voz, con la que canta mientras oculta su verdadera identidad, ha sido descrita como \"de otro mundo\". Ella aparecerá en público por primera vez en un concierto en vivo. A medida que el lugar se llena con todo tipo de fanáticos de Uta: piratas emocionados, la Armada observando de cerca y los Sombreros de Paja liderados por Luffy que simplemente vinieron a disfrutar de su actuación sonora, la voz que todo el mundo ha estado esperando está a punto de resonar. La historia comienza con el impactante hecho de que ella es la \"hija de Shanks\".",
                "Una comedia animada llena de acción para toda la familia inspirada en el clásico atemporal de Mel Brooks 'Blazing Saddles'. Hank, un perro encantador con la cabeza llena de sueños sobre convertirse en samurái, parte en busca de su destino.",
                "Un investigador farmacéutico amenaza con matar a los pasajeros del avión en el que viaja, lo que da paso al caos, desesperación y miedo, no solo dentro del avión, también en el planeta.",
                "Camille y Georges bailan continuamente con su canción preferida: \"Mr. Bojangles\". Con ellos, no hay lugar más que para el placer, la fantasía y los amigos. Hasta el día en que la madre va un paso más allá, obligando a Georges y su hijo Gary a hacer lo que sea para evitar lo inevitable, cueste lo que cueste.",
                "Alice y Jack tienen la suerte de vivir en Victoria, la ciudad experimental de la compañía que alberga a los hombres que trabajan para el Proyecto Victoria, de alto secreto, y a sus familias. La vida es perfecta, con todas las necesidades de los residentes cubiertas por la empresa. Todo lo que piden a cambio es un compromiso incondicional con la causa de Victoria. Pero cuando empiezan a aparecer grietas en su idílica vida, exponiendo destellos de algo mucho más siniestro que se esconde bajo la atractiva fachada, Alice no puede evitar cuestionarse qué están haciendo en Victoria y por qué. ¿Cuánto está dispuesta a perder Alice para sacar a la luz lo que realmente ocurre en el paraíso?",
                "Una epopeya histórica inspirada en los hechos reales que sucedieron en el Reino de Dahomey, uno de los estados más poderosos de África en los siglos XVIII y XIX. La historia sigue a Nanisca (Davis), general de la unidad militar exclusivamente femenina y a Nawi (Mbedu), una recluta ambiciosa. Juntas lucharon contra enemigos que violaron su honor, esclavizaron a su gente y amenazaron con destruir todo por lo que habían vivido.",
                "Young Chickenhare es el hijo adoptivo del rey Peter, un famoso aventurero. Mitad gallina y mitad liebre, le cuesta mucho crecer y se disfraza de liebre para evitar las burlas de sus compañeros. Cuando llega el día de las pruebas de la Royal Adventurer Society, Chickenhare, obstaculizado por su disfraz, fracasa miserablemente. Pero está decidido a aprovechar una segunda oportunidad y encontrar el Cetro del Hámster de la Oscuridad, antes que su malvado tío Lapin. El Cetro otorgará un inmenso poder a quien lo posea. Si Lapin se hace con él, será imparable. Acompañado por su fiel sirviente Abe, una tortuga sarcástica, y Meg, una mofeta experta en artes marciales, emprende una búsqueda épica e iniciática.",
                "Nancy Stokes es una mujer jubilada y viuda que decide cambiar su vida para darle un poco de color. Ya supera los 60 años y está dispuesta a disfrutar de su sexualidad de manera plena. Para ello recurre a los servicios de un trabajador sexual llamado Leo Grande. Junto a él intentará experimentar una noche de placer y autodescubrimiento.",
                "Cuando una ruptura interdimensional altera la realidad, Evelyn (Michelle Yeoh), una inmigrante china en Estados Unidos, se ve envuelta en una aventura salvaje en la que sólo ella puede salvar el mundo. Perdida en los mundos infinitos del multiverso, esta heroína inesperada debe canalizar sus nuevos poderes para luchar contra los extraños y desconcertantes peligros del multiverso mientras el destino del mundo pende de un hilo.",
                "Siete hombres, de entre 17 y 70 años, muy distintos entre sí, aunque todos al borde de una crisis nerviosa, van a seguir una terapia de grupo en plena naturaleza. Este misterioso taller, \\\"exclusivamente reservado para hombres\\\", se supone que hace milagros. Primera sorpresa nada más llegar: ¡el animador es una mujer! Imprevisible y desconcertante, va a hacer todo lo posible para ayudarles a mejorar. Con o sin su consentimiento...",
                "Una pareja divorciada se une y viaja a Bali para evitar que su hija cometa el mismo error que creen que cometieron hace 25 años.",
        };
        for (int i = 0; i < titles.length; i++) {
            listUpcoming.add(new ListElement(titles[i], rating[i], releaseDate[i], "https://image.tmdb.org/t/p/original/" + imagePath[i]));
        }
    }
}

