class GalToLitTable {
    public static void main(String[] args) {
        double gallons, litres;
        int lineCounter;

        lineCounter = 0;

        for(gallons = 1; gallons <= 100; gallons++) {
            litres = gallons * 3.7854;
            System.out.println(gallons + " gallons is " + litres + " litres");
            lineCounter++;
            
            if(lineCounter == 10) {
                System.out.println();
                lineCounter = 0;
            }
        }
    }
}

//cmd line:
//javac GalToLitTable.Java <-  compile
//java GalToLitTable <- run
