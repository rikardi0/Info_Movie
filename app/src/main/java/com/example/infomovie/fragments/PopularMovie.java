package com.example.infomovie.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.infomovie.DetailsScreen;
import com.example.infomovie.R;
import com.example.infomovie.adapter.ListAdapter;
import com.example.infomovie.model.ListElement;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class PopularMovie extends Fragment {

    List<ListElement> element;
    RecyclerView recyclerView;
    ImageView posterImage;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    public PopularMovie() {
        // Required empty public constructor
    }


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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(
                R.layout.popular_movie_list, container, false);
        init();
        Intent intent = new Intent(getContext(), DetailsScreen.class);
        recyclerView = rootView.findViewById(R.id.popular_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        ListAdapter adapter = new ListAdapter(element, getContext());
        recyclerView.setAdapter(adapter);


        return rootView;


    }

    private void init() {
        element = new ArrayList<>();

        String[] titles = {
                "Orphan: First Kill",
                "Hocus Pocus 2",
                "Fall",
                "Bullet Train",
                "Fullmetal Alchemist: The Final Alchemy",
                "Athena",
                "The Infernal Machine",
                "Lou",
                "Secret Headquarters",
                "Pinocchio",
                "Beast",
                "After Ever Happy",
                "Bullet Proof",
                "Thor: Love and Thunder",
                "Smile",
                "Prey",
                "The Greatest Beer Run Ever",
                "DC League of Super-Pets",
                "Jurassic World Dominion",
                "Top Gun: Maverick",


        };
        Double[] rating = {
                6.9,
                7.8,
                7.4,
                7.5,
                7.0,
                6.6,
                6.9,
                6.5,
                7.0,
                6.7,
                7.1,
                6.9,
                5.1,
                6.8,
                6.9,
                7.9,
                7.8,
                7.5,
                7.0,
                8.4,
        };
        String[] releaseDate = {"2022-07-27",
                "2022-09-27",
                "2022-08-11",
                "2022-07-03",
                "2022-06-24",
                "2022-09-09",
                "2022-09-23",
                "2022-09-23",
                "2022-08-12",
                "2022-09-07",
                "2022-08-11",
                "2022-08-24",
                "2022-08-19",
                "2022-07-06",
                "2022-09-23",
                "2022-08-02",
                "2022-09-30",
                "2022-07-27",
                "2022-06-01",
                "2022-05-24",

        };
        String[] imagePath = {
                "/pHkKbIRoCe7zIFvqan9LFSaQAde.jpg",
                "/7ze7YNmUaX81ufctGqt0AgHxRtL.jpg",
                "/spCAxD99U1A6jsiePFoqdEcY0dG.jpg",
                "/tVxDe01Zy3kZqaZRNiXFGDICdZk.jpg",
                "/AeyiuQUUs78bPkz18FY3AzNFF8b.jpg",
                "/fenNPxVF5ERy0CSyVruuEg959Hg.jpg",
                "/bSqpOGzaKBdGkBLmcm1JJIVryYy.jpg",
                "/djM2s4wSaATn4jVB33cV05PEbV7.jpg",
                "/8PsHogUfvjWPGdWAI5uslDhHDx7.jpg",
                "/g8sclIV4gj1TZqUpnL82hKOTK3B.jpg",
                "/xIGr7UHsKf0URWmyyd5qFMAq4d8.jpg",
                "/6b7swg6DLqXCO3XUsMnv6RwDMW2.jpg",
                "/cj6YmTAU7Jvn3w6d2NfjQzpX7Pw.jpg",
                "/pIkRyD18kl4FhoCNQuWxWu5cBLM.jpg",
                "/aPqcQwu4VGEewPhagWNncDbJ9Xp.jpg",
                "/ujr5pztc1oitbe7ViMUOilFaJ7s.jpg",
                "/ggf37TpcKaxwguhvtNn6MQpyqBn.jpg",
                "/r7XifzvtezNt31ypvsmb6Oqxw49.jpg",
                "/kAVRgw7GgK1CfYEJq8ME6EvRIgU.jpg",
                "/62HCnUTziyWcpDaBO2i1DX17ljH.jpg",

        };

        String[] overView = {
                "After escaping from an Estonian psychiatric facility, Leena Klammer travels to America by impersonating Esther, the missing daughter of a wealthy family. But when her mask starts to slip, she is put against a mother who will protect her family from the murderous “child” at any cost.",
                "It’s been 29 years since someone lit the Black Flame Candle and resurrected the 17th-century sisters, and they are looking for revenge. Now it is up to three high-school students to stop the ravenous witches from wreaking a new kind of havoc on Salem before dawn on All Hallow’s Eve.",
                "For best friends Becky and Hunter, life is all about conquering fears and pushing limits. But after they climb 2,000 feet to the top of a remote, abandoned radio tower, they find themselves stranded with no way down. Now Becky and Hunter’s expert climbing skills will be put to the ultimate test as they desperately fight to survive the elements, a lack of supplies, and vertigo-inducing heights",
                "Unlucky assassin Ladybug is determined to do his job peacefully after one too many gigs gone off the rails. Fate, however, may have other plans, as Ladybug's latest mission puts him on a collision course with lethal adversaries from around the globe—all with connected, yet conflicting, objectives—on the world's fastest train.",
                "The Elric brothers’ long and winding journey comes to a close in this epic finale, where they must face off against an unworldly, nationwide threat.",
                "Hours after the tragic death of their youngest brother in unexplained circumstances, three siblings have their lives thrown into chaos.",
                "Reclusive and controversial author Bruce Cogburn is drawn out of hiding by an obsessive fan, forcing the novelist to confront a past that he thought he could escape, and to account for events set in motion by his bestseller decades earlier. Cogburn's search for who is behind the manipulation and mental torment he encounters leads to an emotional roller-coaster ride full of fear and danger, where things are not always as clear as they seem to be, and where past deeds can have dire consequences.",
                "A young girl is kidnapped during a powerful storm. Her mother joins forces with her mysterious neighbour to set off in pursuit of the kidnapper. Their journey will test their limits and expose the dark secrets of their past.",
                "While hanging out after school, Charlie and his friends discover the headquarters of the world’s most powerful superhero hidden beneath his home. When villains attack, they must team up to defend the headquarters and save the world.",
                "A wooden puppet embarks on a thrilling adventure to become a real boy.",
                "A recently widowed man and his two teenage daughters travel to a game reserve in South Africa. However, their journey of healing soon turns into a fight for survival when a bloodthirsty lion starts to stalk them.",
                "As a shocking truth about a couple's families emerges, the two lovers discover they are not so different from each other. Tessa is no longer the sweet, simple, good girl she was when she met Hardin — any more than he is the cruel, moody boy she fell so hard for.",
                "The Thief  pulls off the robbery of a lifetime when he robs the psychotic drug lord, Temple. The plan goes off without a hitch until the Thief discovers a stowaway in his getaway car - Temple's pregnant wife, Mia.",
                "After his retirement is interrupted by Gorr the God Butcher, a galactic killer who seeks the extinction of the gods, Thor Odinson enlists the help of King Valkyrie, Korg, and ex-girlfriend Jane Foster, who now wields Mjolnir as the Mighty Thor. Together they embark upon a harrowing cosmic adventure to uncover the mystery of the God Butcher’s vengeance and stop him before it’s too late.",
                "After witnessing a bizarre, traumatic incident involving a patient, Dr. Rose Cotter starts experiencing frightening occurrences that she can't explain. As an overwhelming terror begins taking over her life, Rose must confront her troubling past in order to survive and escape her horrifying new reality.",
                "When danger threatens her camp, the fierce and highly skilled Comanche warrior Naru sets out to protect her people. But the prey she stalks turns out to be a highly evolved alien predator with a technically advanced arsenal.",
                "Chickie wants to support his friends fighting in Vietnam, so he does something wild—personally bring them American beer. What starts as a well-meaning journey quickly changes Chickie’s life and perspective. Based on a true story.",
                "When Superman and the rest of the Justice League are kidnapped, Krypto the Super-Dog must convince a rag-tag shelter pack - Ace the hound, PB the potbellied pig, Merton the turtle and Chip the squirrel - to master their own newfound powers and help him rescue the superheroes.",
                "Four years after Isla Nublar was destroyed, dinosaurs now live—and hunt—alongside humans all over the world. This fragile balance will reshape the future and determine, once and for all, whether human beings are to remain the apex predators on a planet they now share with history’s most fearsome creatures.",
                "After more than thirty years of service as one of the Navy’s top aviators, and dodging the advancement in rank that would ground him, Pete “Maverick” Mitchell finds himself training a detachment of TOP GUN graduates for a specialized mission the likes of which no living pilot has ever seen.",
        };


        String[] backDrop = {
                "/5GA3vV1aWWHTSDO5eno8V5zDo8r.jpg",
                "/iS9U3VHpPEjTWnwmW56CrBlpgLj.jpg",
                "/hT3OqvzMqCQuJsUjZnQwA5NuxgK.jpg",
                "/83oeqwN64WtafGoITvsOzjKIQaM.jpg",
                "/5hoS3nEkGGXUfmnu39yw1k52JX5.jpg",
                "/ghsPsvM0sEztdNT4kUlTsBF2LEF.jpg",
                "/7AiIrnDMaOhPrw9elJ5NNjijTW4.jpg",
                "/rgZ3hdzgMgYgzvBfwNEVW01bpK1.jpg",
                "/aIkG2V4UXrfkxMdJZmq30xO0QQr.jpg",
                "/nnUQqlVZeEGuCRx8SaoCU4XVHJN.jpg",
                "/2k9tBql5GYH328Krj66tDT9LtFZ.jpg",
                "/rwgmDkIEv8VjAsWx25ottJrFvpO.jpg",
                "/5EzpTMkpg3DecNoP2DAOBlh0Fi6.jpg",
                "/jsoz1HlxczSuTx0mDl2h0lxy36l.jpg",
                "/olPXihyFeeNvnaD6IOBltgIV1FU.jpg",
                "/7ZO9yoEU2fAHKhmJWfAc2QIPWJg.jpg",
                "/z8KsgBFtduX5bS1yVkjoGo4L7KJ.jpg",
                "/qaTzVAW1u16WFNsepjCrilBuInc.jpg",
                "/3PieOs1t6dPHWlgvX3XoqTIQLqN.jpg",
                "/odJ4hx6g6vBt4lBWKFD1tI8WS4x.jpg",
        };
        String path = "https://image.tmdb.org/t/p/original/";
        for (int i = 0; i < titles.length; i++) {
            element.add(new ListElement(path + backDrop[i], overView[i], path + imagePath[i], releaseDate[i], titles[i], rating[i]));
        }
    }
}



