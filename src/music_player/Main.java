package music_player;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicStampedReference;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");

        album a1=new album("old song","manoj kumar");
        a1.addnewsong("mosam bada suhana",3.25);
        a1.addnewsong("khayalo me duba",4.25);
        a1.addnewsong("mere sapno ki rani",4.33);
        a1.addnewsong("zindgi ek safar",3.14);

        album a2=new album("new song","jubin nuthiyal");
        a2.addnewsong("mast najro se allah bachaye ",4.25);
        a2.addnewsong("lut gaye",3.33);
        a2.addnewsong("zara si", 4.6);
        a2.addnewsong("mai jis din bhula dun", 3.36);

        ArrayList<song>playlist=new ArrayList<>();


        a1.addsongplaylist(1,playlist);
        a1.addsongplaylist(3,playlist);

        a2.addsongplaylist("zindgi ek safar",playlist);
        a2.addsongplaylist("zara si",playlist);

        playList(playlist);


    }


    public static void playList (ArrayList<song> playlist)
    {
        System.out.println(playlist.get(0).toString());
        printmenu();




        int currindex=0;
        boolean flag=true;

        while(flag)
        {
            System.out.println("enter your choice");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    if(currindex==playlist.size())
                    {
                        System.out.println("your last song");
                    }
                    else
                    {
                        currindex++;
                        System.out.println(playlist.get(currindex).toString());
                        break;

                    }

                case 2:
                    if(currindex==0)
                    {
                        System.out.println("your first song");
                    }
                    else
                    {
                        currindex--;
                        System.out.println(playlist.get(currindex).toString());
                    }
                    break;
                case 3:
                    System.out.println(playlist.get(currindex).toString());
                    break;
                case 4:
                    printmenu();
                    break;
                case 5:
                    printplaylist(playlist);
                    break;
                case 6:
                    if(currindex>=0)
                    {
                        playlist.remove(currindex);
                        System.out.println(playlist.get(currindex).toString() + "is remove from your playlist ");
                        currindex--;

                    }
                    else
                    {
                        System.out.println("your playlist is Empty ");
                    }
                    break;
                case 7:
                    flag=false;
                    break;
            }
        }
    }
    public static void printmenu()
    {
        System.out.println("press 1 for next song");
        System.out.println("press 2 for previous song");
        System.out.println("press 3 for repeate the song");
        System.out.println("press 4 for print menu");
        System.out.println("press 5 for show playlist");
        System.out.println("press 6 for delet the song ");

    }
    public static  void printplaylist(ArrayList<song>playlist)
    {
        for(song s:playlist)
        {
            System.out.println(s.toString());
        }
    }
}