package perf.oop;

public class Main {
    public static void main( String[] args ) throws Exception {
        System.in.read();

        String str1 = "sdfljkgldkfjghdlkfjghlkjghuihgp34hgjkghlaergh4rghq;4hgqlk4jhyq3lwk4jghlkjgh";
        String str2 = "sdfljkgldkfjghdlkfjghlkjghuihgp34hgjkghlaergh4rghq;4hgqlk4jhyq3lwk4jghlkjgh";
        String str3 = "sdfljkgldkfjghdlkfjghlkjgsdfwerhuihgp34hgjkghlaergh4rghq;4hgqlk4jhyq3lwk4jghlkjgh";
        String str4 = "sdfljkgldkfjghdlkfjghlkjghui32hgp34hgjkghlaergh4rghq;4hgqlk4jhyq3lwk4jghlkjgh";
        String str5 = "sdfljkgldkfjghdlkfjghlkjw32ghuihgp34hgjkghlaergh4rghq;4hgqlk4jhyq3lwk4jghlkjgh";
        String str6 = "sdfljkgldkfjghdlkfjghlkjaergghuihgp34hgjkghlaergh4rghq;4hgqlk4jhyq3lwk4jghlkjgh";
        String str7 = "sdfljkgldkfjghdlkfjghlkrgejghuihgp34hgjkghlaergh4rghq;4hgqlk4jhyq3lwk4jghlkjgh";
        String str8 = "sdfljkgldkfjghdlkfjghlkargjghuihgp34hgjkghlaergh4rghq;4hgqlk4jhyq3lwk4jghlkjgh";
        String str9 = "sdfljkgldkfjghdlkfjghlagkjghuihgp34hgjkghlaergh4rghq;4hgqlk4jhyq3lwk4jghlkjgh";
        String str10 = "sdfljkgldkfjghdlkfjghlkjghut4ihgp34hgjkghlaergh4rghq;4hgqlk4jhyq3lwk4jghlkjgh";

        //Прогрев
        for(int i=0; i<100; i++) {
            String sss = "sdfsdf";
        }
        Thread.sleep(1000);

        long timeStart = System.nanoTime();
        System.out.println("Start Time = " + timeStart);
        for(int i=0; i<10000000; i++) {
            /*
            SetGet setGet = new SetGet();
            setGet.setStr1(str1);
            setGet.setStr2(str2);
            setGet.setStr3(str3);
            setGet.setStr4(str4);
            setGet.setStr5(str5);
            setGet.setStr6(str6);
            setGet.setStr7(str7);
            setGet.setStr8(str8);
            setGet.setStr9(str9);
            setGet.setStr10(str10);

             */
            ObjectOrientir objectOrientir = new ObjectOrientir(
                    str1, str2, str3, str4, str5, str6, str7, str8, str9, str10
            );
        }
        long timeEnd = System.nanoTime();
        System.out.println("End Time = " + timeEnd);
        long diff = (timeEnd - timeStart);
        System.out.println("Diff Time = " + diff);

        Thread.sleep(5000);

        long timeStartMath = System.nanoTime();
        System.out.println("Start Time timeStartMath = " + timeStartMath);
        for(int i=0; i<10000000; i++) {
            /*
            ObjectOrientir objectOrientir = new ObjectOrientir(
                str1, str2, str3, str4, str5, str6, str7, str8, str9, str10
            );

             */
            SetGet setGet = new SetGet();
            setGet.setStr1(str1);
            setGet.setStr2(str2);
            setGet.setStr3(str3);
            setGet.setStr4(str4);
            setGet.setStr5(str5);
            setGet.setStr6(str6);
            setGet.setStr7(str7);
            setGet.setStr8(str8);
            setGet.setStr9(str9);
            setGet.setStr10(str10);
        }
        long timeEndMath = System.nanoTime();
        System.out.println("End Time timeEndMath = " + timeEndMath);
        long diffMath = (timeEndMath - timeStartMath);
        System.out.println("Diff Time diffMath = " + diffMath);

        System.out.println("Diff perf diff/diffMath = " + (double)diffMath/diff);
    }
}
