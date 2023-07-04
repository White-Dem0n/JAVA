public class stringbuilder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hony");
        System.out.println(sb);

        //char at any index
        System.out.println(sb.charAt(0));

        // set char at any index
        sb.setCharAt(0, 'b');
        System.out.println(sb);


        // insert char at any index
        sb.insert(1,'o');
        System.out.println(sb);

        // selet char at any index
        sb.delete(1, 2);
        System.out.println(sb);


        // appending at end
        StringBuilder sb2 = new StringBuilder("h");
        sb2.append("e");
        sb2.append("l");
        sb2.append("l");
        sb2.append("o");
        sb2.append("!");
        System.out.println(sb2);
        System.out.println(sb2.length());




        // revrse string
        StringBuilder sb3 = new StringBuilder("Hello");

        for(int i=0; i<2; i++){
            int front = i;
            int back = sb3.length()- 1 - i;             // 5-1-0 => 4

            char frontchar = sb3.charAt(front);
            char backchar = sb3.charAt(back);

            sb3.setCharAt(front, backchar);
            sb3.setCharAt(back, frontchar);
        }
        System.out.println(sb3);
        
    }
}
