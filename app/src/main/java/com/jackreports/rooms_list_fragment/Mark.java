package com.jackreports.rooms_list_fragment;

import java.util.Map;

/**
 * implement data class for Mark List items
 */
public class Mark {
    public Mark(){}
    public Mark(int id, String title ){
      this.id=id;
      this.title=title;



    }

   public int id=0;
    public String title, caption="";
    public int status=0;
    public String latitude="0";
    public String longitude="0";
    public String state="";
    public String road_f="";
    public String road_s="";
    public String direction="";

}
