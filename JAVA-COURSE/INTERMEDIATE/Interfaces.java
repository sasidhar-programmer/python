/*
   interfaces classes are like abstract classes 
   we can't define methods in interface classes we can only declare methods 
   we can't create the objects for interface classes  
   if we implements interface classes in another classs we must need to use the declared 
      methods 

*/

interface Games {

    void RenderGraphics();

}

interface map {

    public void rendermap();
}

interface racetracks {

    public void renderRaceTacks();

}

class pubg implements Games, map { 



    public void RenderGraphics() {
        System.out.println("Rendering pubg graphics");
    }
    
    public void rendermap() { 

        System.out.println("rendering map");
    }
    
}



class Asphalt implements Games , racetracks {


    public void RenderGraphics() {
        System.out.println("Rendering Asphalt graphics"); 
    }   

    public void renderRaceTacks() { 
        System.out.println("rendering racetracks");
    }
}

class startgame {
    public void start(Games a) {
        a.RenderGraphics();
    }

}

public class Interfaces {
    public static void main(String[] args) {

        startgame sg = new startgame();
        Asphalt as = new Asphalt();
        pubg p = new pubg(); 

        sg.start(p); 
        sg.start(as); 

    }

}