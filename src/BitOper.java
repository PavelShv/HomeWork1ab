public class BitOper {
    
    // битовая операция НЕ !
    public static void main(String[] args) {
        int var = 100;  //bin: 01100100
        int not_v = ~var; //result:  1111111111111111111111111111111111111111111111111111111110011011 (число -101)
        System.out.println(not_v);

        //Битовая операция И
        byte flags = 3;  //bin:  0011
        byte mask = 2; //bin:  0010
        int res = flags&mask;
        System.out.println(res);

        //Битовая операция ИЛИ
        byte flags1 = 12;  //bin:  1100
        byte mask1 = 10;   //bin:  1010
        flags1 = (byte)(flags1 | mask1);   //bin: 1110 (oct: 14)
        System.out.println(flags1);


        //Битовая операция исключающее ИЛИ (XOR)
        byte flags2 = 9;  //bin:  00001001
        byte mask2 = 1;   //bin:  00000001
        flags2 = (byte)(flags2 ^ mask2);     //bin 00001000 (число 8)
        System.out.println(flags2);
        flags2 ^= mask;    //bin 00001001 (число 9)
        System.out.println(flags2);

        /// Шифрование через XOR
        String msg = "Кеша хороший";
        byte key = 111;
        System.out.println(msg);
        char[] str = msg.toCharArray();
        for(int i=0;i < msg.length();++i)
            str[i] ^= key;
        msg = new String(str);
        System.out.println(msg);
        for(int i=0;i < msg.length();++i)
            str[i] ^= key;
        msg = new String(str);
        System.out.println(msg);

        //Операторы смещения бит
        int x = 2000;
        System.out.println(x);
        x = x >> 1;
        System.out.println(x);
        x = x >> 1;
        System.out.println(x);
        x = x >> 1;
        System.out.println(x);
        x = x >> 1;
        System.out.println(x);
        x = x >> 1;
        System.out.println(x);
        x = x >> 1;
        System.out.println(x);
        x = x >> 1;
        System.out.println(x);

    }
}

