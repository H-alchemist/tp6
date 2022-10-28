package umlJva;


import java.util.ArrayList;

class test{

public static void main(String [] args) {
    Stylo stl1=new Stylo("a1","red",null);
    Stylo stl2=new Stylo("a1","green",null);
    Stylo stl3=new Stylo("a2","yellow",null);
    Stylo stl4=new Stylo("a3","purple",null);
    ArrayList<Stylo> SS=new ArrayList<Stylo>();
    SS.add(stl1);
    SS.add(stl2);
    SS.add(stl3); 
    SS.add(stl4);   

    Stagiare strg1=new Stagiare("hamza", "ech", SS);
    Stagiare strg2=new Stagiare("ilyass", "ech", SS);
    Stagiare strg3=new Stagiare("ismail", "ech", SS);
    Stagiare strg4=new Stagiare("dress", "ech", SS);
    Stagiare strg5=new Stagiare("hatim", "ech", SS);
    Stagiare strg6=new Stagiare("solaiman", "ech", SS);
    Stagiare strg7=new Stagiare("mohamed", "ech", SS);
    Stagiare strg8=new Stagiare("ayoub", "ech", SS);
    ArrayList<Stagiare> alhg=new ArrayList<Stagiare>();
    alhg.add(strg1);
    alhg.add(strg2);
    alhg.add(strg3);
    alhg.add(strg4);
     alhg.add(strg5);
    alhg.add(strg6);
    alhg.add(strg7);
    alhg.add(strg8);
    Groupe DD104=new Groupe("201",alhg);
    int size=DD104.getalhg().size();
   
 
    for (int i = 0; i < size; i++) {

        System.out.println(DD104.getalhg().get(i).getnom());
        
    }


}
}