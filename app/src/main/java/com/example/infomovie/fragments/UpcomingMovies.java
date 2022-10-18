package com.example.infomovie.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.infomovie.R;
import com.example.infomovie.adapter.ListAdapter;
import com.example.infomovie.model.ListElement;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


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
        String[] titles = {"Fall",
                "Jeepers Creepers: Reborn",
                "X",
                "Black Adam",
                "Paws of Fury: The Legend of Hank",
                "Halloween Ends",
                "Tenor",
                "Into the Deep",
                "One Piece Film Red",
                "Tad the Lost Explorer and the Curse of the Mummy",
                "Good Luck to You, Leo Grande",
                "Emergency Declaration",
                "Men on the Verge of a Nervous Breakdown",
                "Waiting for Bojangles",
                "The Woman King",
                "Chickenhare and the Hamster of Darkness",
                "Don't Worry Darling",
                "Barbarian",
                "Everything Everywhere All at Once",
                "Superwho?",

        };
        Double[] rating = {
                7.4,
                5.8,
                6.8,
                0.,
                6.7,
                7.7,
                7.1,
                6.9,
                7.4,
                7.2,
                7.0,
                6.9,
                5.6,
                7.6,
                7.1,
                7.4,
                6.8,
                7.2,
                8.2,
                6.1,

        };
        String[] releaseDate = {"2022-08-11",
                "2022-09-15",
                "2022-03-17",
                "2022-10-19",
                "2022-07-14",
                "2022-10-12",
                "2022-05-04",
                "2022-08-26",
                "2022-08-06",
                "2022-08-24",
                "2022-06-17",
                "2022-08-03",
                "2022-02-10",
                "2022-01-05",
                "2022-09-15",
                "2022-02-16",
                "2022-09-21",
                "2022-09-08",
                "2022-03-24",
                "2022-02-02",

        };
        String[] imagePath = {
                "/spCAxD99U1A6jsiePFoqdEcY0dG.jpg",
                "/aGBuiirBIQ7o64FmJxO53eYDuro.jpg",
                "/woTQx9Q4b8aO13jR9dsj8C9JESy.jpg",
                "/3zXceNTtyj5FLjwQXuPvLYK5YYL.jpg",
                "/vccE9bBa9mgghFpkWzU1fQqmOKB.jpg",
                "/3aEJDJ9O8lsRMM9Xaxxm5kNyt0N.jpg",
                "/t8ShCiZxrbiy7kuO06OilLI3PeL.jpg",
                "/bPyBqGBYjGzyLVHJEIsCwlZejk.jpg",
                "/m80kPdrmmtEh9wlLroCp0bwUGH0.jpg",
                "/yt0CGOtKbFGR4bqLnDyB0rJeUrZ.jpg",
                "/5wQydIQYho2wz1suPOoPoNgMzCm.jpg",
                "/h7kaQG5MbraSLibOuTpo0gtMxRz.jpg",
                "/9IiTNWohanK62otUDGoCvgx2mI7.jpg",
                "/x7pOnu6IfkTFkkOguXPKK81ME4g.jpg",
                "/438QXt1E3WJWb3PqNniK0tAE5c1.jpg",
                "/2v6f1EqTo4FUxVT9MDXpF6158AX.jpg",
                "/jOqxKIOC92BVyinYO1Fm73XY7Tc.jpg",
                "/9WDk6Nu9RbeBAPutywTUa28rZej.jpg",
                "/w3LxiVYdWWRvEVdn5RYq6jIqkb1.jpg",
                "/Aie2kiYOUgZeakpshM2N64PKof1.jpg",
        };

        String[] overView = {
                "For best friends Becky and Hunter, life is all about conquering fears and pushing limits. But after they climb 2,000 feet to the top of a remote, abandoned radio tower, they find themselves stranded with no way down. Now Becky and Hunter’s expert climbing skills will be put to the ultimate test as they desperately fight to survive the elements, a lack of supplies, and vertigo-inducing heights",
                "Forced to travel with her boyfriend to a horror festival, Laine begins to experience disturbing visions associated with the urban legend of The Creeper. As the festival arrives and the blood-soaked entertainment builds to a frenzy, she becomes the center of it while something unearthly has been summoned.",
                "In 1979, a group of young filmmakers set out to make an adult film in rural Texas, but when their reclusive, elderly hosts catch them in the act, the cast find themselves fighting for their lives.",
                "Nearly 5,000 years after he was bestowed with the almighty powers of the Egyptian gods and imprisoned just as quickly Black Adam is freed from his earthly tomb, ready to unleash his unique form of justice on the modern world.",
                "A hard-on-his-luck hound finds himself in a town full of cats in need of a hero to defend them from a ruthless villain's wicked plot to wipe their village off the map. With help from a reluctant mentor, our underdog must assume the role of town samurai and team up with the villagers to save the day.",
                "Four years after the events of Halloween in 2018, Laurie has decided to liberate herself from fear and rage and embrace life. But when a young man is accused of killing a boy he was babysitting, it ignites a cascade of violence and terror that will force Laurie to finally confront the evil she can’t control, once and for all.",
                "While working part-time as a food deliveryman, Antoine, an aspiring young rapper from the suburbs of Paris, meets Mrs. Loiseau, an eminent teacher at the Paris Opéra. Stunned by the young man's raw talent, she introduces him to the world of opera. As Antoine becomes one of Mrs. Loiseau's students, he hides his new dream from his friends and family, fearing that they won’t understand – this double life burdens him... Somewhere in between the gilded and uptight Parisian upper-class, and the harsh yet free-spirited and familiar suburbs he grew up in, Antoine will have to find his own voice.",
                "Follows a woman desperate to escape her town, she meets a stranger who promises a romantic escape, but it results in deceit, mistrust, and violence.",
                "Uta — the most beloved singer in the world. Her voice, which she sings with while concealing her true identity, has been described as “otherworldly.” She will appear in public for the first time at a live concert. As the venue fills with all kinds of Uta fans — excited pirates, the Navy watching closely, and the Straw Hats led by Luffy who simply came to enjoy her sonorous performance — the voice that the whole world has been waiting for is about to resound.",
                "Tad would love for his archeologist colleagues to accept him as one of their own, but he always messes everything up. Tad accidentally destroys a sarcophagus and unleashes an ancient spell endangering the lives of his friends: Mummy, Jeff and Belzoni. With everyone against him and only helped by Sara, he sets off on an adventure that will take him from Mexico to Chicago and from Paris to Egypt, in order to put an end to the curse of the Mummy.",
                "Nancy Stokes doesn’t know good sex. Whatever it may be, Nancy, a retired schoolteacher, is pretty sure she has never had it, but she is determined to finally do something about that. She even has a plan: It involves an anonymous hotel room, and a young sex worker who calls himself Leo Grande.",
                "While investigating a terroristic threat that goes viral online, Korean authorities discover that a suspect has recently boarded an international flight bound for the United States. When a healthy passenger on the same flight suddenly dies a gruesome death of unknown cause, panic erupts both in-flight and on the ground. With steadily decreasing fuel and international refusals to offer aid, the captain and crew will be forced to take unprecedented emergency measures in an attempt to save the lives of their passengers.",
                "Seven men, all city-dwellers aged between 17 and 70, with nothing in common apart from the fact that they are all on the verge of a nervous breakdown, meet up at a lonely sta- tion for an unusual course in the wild that is supposed to get them back on their feet. Each step in this boot camp, designed by an eccentric and feisty female coach, aims to reveal them to themselves. The task seems to be a tough one, especially as nothing goes as planned between these men.",
                "In front of their little boy, Camille and Georges dance on their favorite song \"Mr Bojangles\". With them, there is only place for fun and fantasy. The one who shows the way is the mother, an unpredictable wisp. She leads them into a whirlwind of poetry so that the party continues again and again, no matter what happens. Mad love has never lived up to its name so well.",
                "The story of the Agojie, the all-female unit of warriors who protected the African Kingdom of Dahomey in the 1800s with skills and a fierceness unlike anything the world has ever seen, and General Nanisca as she trains the next generation of recruits and readies them for battle against an enemy determined to destroy their way of life.",
                "Young Chickenhare is the adopted son of King Peter, a famous adventurer. Part chicken and part hare, he has a really tough time growing up and disguises himself as a hare to avoid the mockeries of his peers. When the day of the Royal Adventurer Society trials comes, Chickenhare, hampered by his disguise, fails miserably. But he is determined to grab a second chance and find the Scepter of the Hamster of Darkness, before his evil Uncle Lapin. The Scepter will give immense power to its holder. If Lapin gets hold of it, he will be unstoppable. Accompanied by his faithful servant Abe, a sarcastic turtle, and Meg, a martial arts expert skunk, he sets of on an epic and initiatory quest.",
                "Alice and Jack are lucky to be living in the idealized community of Victory, the experimental company town housing the men who work for the top-secret Victory Project and their families. But when cracks in their idyllic life begin to appear, exposing flashes of something much more sinister lurking beneath the attractive façade, Alice can’t help questioning exactly what they’re doing in Victory, and why.",
                "In town for a job interview, a young woman arrives at her Airbnb late at night only to find that it has been mistakenly double-booked and a strange man is already staying there. Against her better judgement, she decides to stay the night anyway, but soon discovers that there is much more to be afraid of in the house than the other guest.",
                "An aging Chinese immigrant is swept up in an insane adventure, where she alone can save what's important to her by connecting with the lives she could have led in other universes.",
                "A struggling actor seems doomed to live life as a loser. When he finally snatches a lead role as a superhero named “Badman,” he feels like everything is possible, but fate strikes again.",
        };
        String[] backDrop = {
                "/hT3OqvzMqCQuJsUjZnQwA5NuxgK.jpg",
                "/tIX6j3NzadlwGcJ52nuWdmtOQkg.jpg",
                "/21ldFAokKVjwzi1SHXoPb5gc7md.jpg",
                "/grATqZhXqK9wN7nH0BzjVIgatZD.jpg",
                "/92PJmMopfy64VYjd0HvIQaHGZX0.jpg",
                "/pvlRjQHd9IlZ2ZyyH0SlW8eZsLE.jpg",
                "/7IW5xt241RUAufYiFBoAPx5n52V.jpg",
                "/7YI3LxKLTxHjes9OaBUYrKdXqh3.jpg",
                "/54PmeEzQMvpojpJBku61ZGQnWUX.jpg",
                "/piEEg5kDQyxK05V4Am8sVxFe267.jpg",
                "/fILWktCfh0ZiKWjWwyXalWzSvKX.jpg",
                "/fI8hv1IqWUIUjx4YRfl6TWhdqHW.jpg",
                "/b6FPcYuYNwK63b0i2NhTZN5Iimi.jpg",
                "/jD3et0aL3yDDZZ6R9I4DzyjyofW.jpg",
                "/gkseI3CUfQtMKX41XD4AxDzhQb7.jpg",
                "/sahdgvn0Brw6AgdwyLHgdCAynWG.jpg",
                "/4O9kFXsBjlxtgzXWHfgMS9CjhbN.jpg",
                "/7ydeRa5w6o7fLdGKP79ek5VJdlS.jpg",
                "/tt79dbOPd9Z9ykEOpvckttgYXwH.jpg",
                "/rfbpgHbotsnB4sopZDIA3EhPecQ.jpg",
        };
        String path = "https://image.tmdb.org/t/p/original/";
        for (int i = 0; i < titles.length; i++) {
            listUpcoming.add(new ListElement(path + backDrop[i],overView[i], path + imagePath[i], releaseDate[i], titles[i], rating[i] ));
        }
    }
}

