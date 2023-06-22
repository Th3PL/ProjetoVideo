package projetovideo;

public class ProjetoVideo {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        
        v[0] = new Video("Aula 1 POO");
        v[1] = new Video("Aula 12 PHP");
        v[2] = new Video("Aula 10 de HTML5");
               
        
        Gafanhoto g[] = new Gafanhoto[2];
        
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 25, "F", "Cre");
        
        Visualizacao vis = new Visualizacao(g[0], v[0]); 
    }
    
}
