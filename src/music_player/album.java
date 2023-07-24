package music_player;

import java.util.ArrayList;
import java.util.LinkedList;

public class album {
    private String nameofalbum;
    private String nameofsinger;
    private ArrayList<song>listofsong;

    public album(String nameofalbum, String nameofsinger) {
        this.nameofalbum = nameofalbum;
        this.nameofsinger = nameofsinger;
        this.listofsong=new ArrayList<>();

    }
    public  boolean  findsongbytitle(String title)
    {
        for(song s:listofsong)
        {
            if(s.getTitle().equals(title))
            {
                return true;
            }

        }
        return false;
    }
    public String addnewsong(String title,double duration)
    {
        if(findsongbytitle(title))
        {
            return "song is already added";
        }
        song s=new song(title,duration);
        listofsong.add(s);
        return "somg is added";
    }
    public String addsongplaylist(int songno, ArrayList<song> playlist)
    {
        songno=songno-1;
       if(songno>=0 && songno<listofsong.size())
       {
           song s=listofsong.get(songno);
           playlist.add(s);
           return "song added to playlist ";
       }
       else
       {
           return "song no entered is out of range ";
       }

    }
    public String addsongplaylist(String title ,ArrayList<song>playlist)
    {
         for(song s:listofsong)
         {
             if(s.getTitle().equals(title))
             {
                 playlist.add(s);
                 return "song added to playlist";
             }

         }
         return "no song found with given title";

         }
    }

