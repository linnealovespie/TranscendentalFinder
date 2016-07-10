/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piroot;

/**
 *
 * @author Linnea
 */
public class PiRoot {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double piRoot = 9.5; 
        //System.out.println(findRoot(piRoot));
        findRoot(piRoot, 0.5);
        
    }
    
    static public double findRoot(double d, double a){
        double add = a;
        double root = Math.pow(d, 0.5);
        System.out.println("Root " + d + " --- " + root);
        if( root!= Math.PI) {
            if(root < Math.PI){
                add = add/2;
                d += add;
                findRoot(d, add);
            }
            else{
                add = add/2; 
                d -= add;
                findRoot(d, add);
            }
        }
            return d;
} 
            
    
}
