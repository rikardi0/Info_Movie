package com.example.infomovie.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.infomovie.R;
import com.example.infomovie.adapter.ListAdapter;
import com.example.infomovie.model.ListElement;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


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
                "Orphan: First Kill",
                "Fall",
                "Bullet Train",
                "Athena",
                "The Infernal Machine",
                "Beast",
                "After Ever Happy",
                "Bullet Proof",
                "Smile",
                "The Greatest Beer Run Ever",
                "DC League of Super-Pets",
                "Top Gun: Maverick",
                "Dragon Ball Super: Super Hero",
                "Stowaway",
                "Wire Room",
                "Avatar",
                "The Black Phone",
                "Spider-Man: No Way Home",
                "Jeepers Creepers: Reborn",
                "Morbius",

        };
        Double[] rating = {

                6.9,
                7.4,
                7.5,
                6.6,
                6.9,
                7.1,
                6.9,
                5.1,
                6.9,
                7.8,
                7.5,
                8.4,
                8.0,
                5.0,
                6.8,
                7.5,
                7.9,
                8.0,
                5.8,
                6.4,
        };
        String[] releaseDate = {
                "2022-07-27",
                "2022-08-11",
                "2022-07-03",
                "2022-09-09",
                "2022-09-23",
                "2022-08-11",
                "2022-08-24",
                "2022-08-19",
                "2022-09-23",
                "2022-09-30",
                "2022-07-27",
                "2022-05-24",
                "2022-06-11",
                "2022-08-31",
                "2022-09-02",
                "2009-12-15",
                "2022-06-22",
                "2021-12-15",
                "2022-09-15",
                "2022-03-30",
        };
        String[] imagePath = {
                "/pHkKbIRoCe7zIFvqan9LFSaQAde.jpg",
                "/spCAxD99U1A6jsiePFoqdEcY0dG.jpg",
                "/tVxDe01Zy3kZqaZRNiXFGDICdZk.jpg",
                "/fenNPxVF5ERy0CSyVruuEg959Hg.jpg",
                "/bSqpOGzaKBdGkBLmcm1JJIVryYy.jpg",
                "/xIGr7UHsKf0URWmyyd5qFMAq4d8.jpg",
                "/6b7swg6DLqXCO3XUsMnv6RwDMW2.jpg",
                "/cj6YmTAU7Jvn3w6d2NfjQzpX7Pw.jpg",
                "/aPqcQwu4VGEewPhagWNncDbJ9Xp.jpg",
                "/ggf37TpcKaxwguhvtNn6MQpyqBn.jpg",
                "/r7XifzvtezNt31ypvsmb6Oqxw49.jpg",
                "/62HCnUTziyWcpDaBO2i1DX17ljH.jpg",
                "/rugyJdeoJm7cSJL1q4jBpTNbxyU.jpg",
                "/1RmugOkBFU5eXu1dbr1zdxChLfQ.jpg",
                "/b9ykj4v8ykjRoGB7SpI1OuxblNU.jpg",
                "/jRXYjXNq0Cs2TcJjLkki24MLp7u.jpg",
                "/lr11mCT85T1JanlgjMuhs9nMht4.jpg",
                "/uJYYizSuA9Y3DCs0qS4qWvHfZg4.jpg",
                "/aGBuiirBIQ7o64FmJxO53eYDuro.jpg",
                "/6JjfSchsU6daXk2AKX8EEBjO3Fm.jpg",
        };

        String[] overView = {
                "After escaping from an Estonian psychiatric facility, Leena Klammer travels to America by impersonating Esther, the missing daughter of a wealthy family. But when her mask starts to slip, she is put against a mother who will protect her family from the murderous “child” at any cost.",
                "For best friends Becky and Hunter, life is all about conquering fears and pushing limits. But after they climb 2,000 feet to the top of a remote, abandoned radio tower, they find themselves stranded with no way down. Now Becky and Hunter’s expert climbing skills will be put to the ultimate test as they desperately fight to survive the elements, a lack of supplies, and vertigo-inducing heights",
                "Unlucky assassin Ladybug is determined to do his job peacefully after one too many gigs gone off the rails. Fate, however, may have other plans, as Ladybug's latest mission puts him on a collision course with lethal adversaries from around the globe—all with connected, yet conflicting, objectives—on the world's fastest train.",
                "Hours after the tragic death of their youngest brother in unexplained circumstances, three siblings have their lives thrown into chaos.",
                "Reclusive and controversial author Bruce Cogburn is drawn out of hiding by an obsessive fan, forcing the novelist to confront a past that he thought he could escape, and to account for events set in motion by his bestseller decades earlier. Cogburn's search for who is behind the manipulation and mental torment he encounters leads to an emotional roller-coaster ride full of fear and danger, where things are not always as clear as they seem to be, and where past deeds can have dire consequences.",
                "A recently widowed man and his two teenage daughters travel to a game reserve in South Africa. However, their journey of healing soon turns into a fight for survival when a bloodthirsty lion starts to stalk them.",
                "As a shocking truth about a couple's families emerges, the two lovers discover they are not so different from each other. Tessa is no longer the sweet, simple, good girl she was when she met Hardin — any more than he is the cruel, moody boy she fell so hard for.",
                "The Thief  pulls off the robbery of a lifetime when he robs the psychotic drug lord, Temple. The plan goes off without a hitch until the Thief discovers a stowaway in his getaway car - Temple's pregnant wife, Mia.",
                "After witnessing a bizarre, traumatic incident involving a patient, Dr. Rose Cotter starts experiencing frightening occurrences that she can't explain. As an overwhelming terror begins taking over her life, Rose must confront her troubling past in order to survive and escape her horrifying new reality.",
                "Chickie wants to support his friends fighting in Vietnam, so he does something wild—personally bring them American beer. What starts as a well-meaning journey quickly changes Chickie’s life and perspective. Based on a true story.",
                "When Superman and the rest of the Justice League are kidnapped, Krypto the Super-Dog must convince a rag-tag shelter pack - Ace the hound, PB the potbellied pig, Merton the turtle and Chip the squirrel - to master their own newfound powers and help him rescue the superheroes.",
                "After more than thirty years of service as one of the Navy’s top aviators, and dodging the advancement in rank that would ground him, Pete “Maverick” Mitchell finds himself training a detachment of TOP GUN graduates for a specialized mission the likes of which no living pilot has ever seen.",
                "The Red Ribbon Army, an evil organization that was once destroyed by Goku in the past, has been reformed by a group of people who have created new and mightier Androids, Gamma 1 and Gamma 2, and seek vengeance against Goku and his family.",
                "A tenacious party girl fights to survive after three thieves commandeer her luxury yacht. Unable to escape and trapped on the yacht at high seas, the prey becomes the hunter as she turns the tables on the intruders and takes matters into her own hands.",
                "New recruit Justin Rosa must monitor arms-smuggling cartel member Eddie Flynn — and keep him alive at all costs. When a SWAT team descends on Flynn’s home, Rosa breaks protocol and contacts the gangster directly to save his life. As gunmen break into the Wire Room and chaos erupts, Mueller and Rosa make a final, desperate stand against the corrupt agents and officials who seek to destroy evidence and kill them both.",
                "In the 22nd century, a paraplegic Marine is dispatched to the moon Pandora on a unique mission, but becomes torn between following orders and protecting an alien civilization.",
                "Finney Blake, a shy but clever 13-year-old boy, is abducted by a sadistic killer and trapped in a soundproof basement where screaming is of little use. When a disconnected phone on the wall begins to ring, Finney discovers that he can hear the voices of the killer’s previous victims. And they are dead set on making sure that what happened to them doesn’t happen to Finney.",
                "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
                "Forced to travel with her boyfriend to a horror festival, Laine begins to experience disturbing visions associated with the urban legend of The Creeper. As the festival arrives and the blood-soaked entertainment builds to a frenzy, she becomes the center of it while something unearthly has been summoned.",
                "Dangerously ill with a rare blood disorder, and determined to save others suffering his same fate, Dr. Michael Morbius attempts a desperate gamble. What at first appears to be a radical success soon reveals itself to be a remedy potentially worse than the disease.",
        };
        String[] backDrop = {
                "/5GA3vV1aWWHTSDO5eno8V5zDo8r.jpg",
                "/hT3OqvzMqCQuJsUjZnQwA5NuxgK.jpg",
                "/83oeqwN64WtafGoITvsOzjKIQaM.jpg",
                "/ghsPsvM0sEztdNT4kUlTsBF2LEF.jpg",
                "/7AiIrnDMaOhPrw9elJ5NNjijTW4.jpg",
                "/2k9tBql5GYH328Krj66tDT9LtFZ.jpg",
                "/rwgmDkIEv8VjAsWx25ottJrFvpO.jpg",
                "/5EzpTMkpg3DecNoP2DAOBlh0Fi6.jpg",
                "/olPXihyFeeNvnaD6IOBltgIV1FU.jpg",
                "/z8KsgBFtduX5bS1yVkjoGo4L7KJ.jpg",
                "/qaTzVAW1u16WFNsepjCrilBuInc.jpg",
                "/odJ4hx6g6vBt4lBWKFD1tI8WS4x.jpg",
                "/ugS5FVfCI3RV0ZwZtBV3HAV75OX.jpg",
                "/tviTAFuCFRLElylvBAMPjdRnCDZ.jpg",
                "/6AxdvA5hiBGF5ajSKsyt0q7rHei.jpg",
                "/7ABsaBkO1jA2psC8Hy4IDhkID4h.jpg",
                "/AfvIjhDu9p64jKcmohS4hsPG95Q.jpg",
                "/14QbnygCuTO0vl7CAFmPf1fgZfV.jpg",
                "/tIX6j3NzadlwGcJ52nuWdmtOQkg.jpg",
                "/jzWT0zd8U77fqWg5WgUfYaMzSFz.jpg",

        };
        String path = "https://image.tmdb.org/t/p/original/";
        for (int i = 0; i < titles.length; i++) {
            listMovie.add(new ListElement(titles[i], rating[i], releaseDate[i], path + imagePath[i], overView[i], path + backDrop[i]));
        }

    }
}

