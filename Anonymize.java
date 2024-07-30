public class Anonymize {
    public static void main(String[] args) {

        String name = args[0];
        int count = 1;

        String[] elefirst = StdIn.readLine().split(",");


        for (String a : elefirst) {
            if (a.equals(name)) break;
            count++;
        }

        boolean firstelem = true;
        for (String a : elefirst) {

            if (a.equals(name)) continue;

            if (firstelem) {
                StdOut.print(a);
                firstelem = false;
            }

            else StdOut.print("," + a);

        }

        StdOut.println();


        String[] otherelements;


        while (StdIn.hasNextLine()) {

            otherelements = StdIn.readLine().split(",");

            int count2 = 0;

            boolean firstother = true;
            for (String a : otherelements) {

                count2++;
                if (count2 == count) continue;

                if (firstother) {
                    StdOut.print(a);
                    firstother = false;
                }
                else StdOut.print("," + a);

            }

            StdOut.println();

        }

    }
}
