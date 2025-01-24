public class Championship {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int gryffindor = 400;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points

        int margin = gryffindor - ravenclaw;

        if(margin < -100){
            System.out.println("In fourth place, Gryffindor!");
        }
        else if(margin >= -100 && margin < 1) {
            System.out.println("In third place, Gryffindor!");
        } else if(margin > 0 && margin < 300){
            System.out.println("In second place, Gryffindor!");
        } else {
            System.out.println("Gryffindor takes the House Cup!");
        }
        
    }
}
