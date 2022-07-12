public class TempConverter {

    public void convertToCel(double fahrenheight){
        System.out.println(fahrenheight + " fahrenheight tranformed into celsius = " + Math.round((fahrenheight-32)*5/9) + " degrees celsius. ");
    }

    public void convertToFah(double celsius){
        System.out.println(celsius + " degrees celsius tranformed into fohrenheight  =  " + Math.round((celsius * 1.8) + 32) + " fahrenheight.");
    }
}
