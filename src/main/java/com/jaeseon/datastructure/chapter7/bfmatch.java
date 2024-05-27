package com.jaeseon.datastructure.chapter7;

public class bfmatch {

    static int match( String txt, String pat){

        int pt = 0; // txt 커서
        int pp = 0; // pat 커서

        while ( pt != txt.length() && pp != pat.length() ){
            // 하나씩 비교했을때 일치할시 하나씩증가
            if( txt.charAt(pt) == pat.charAt(pp)){

                pt++;
                pp++;
            }
            // 일치하지않을시, 텍스트는 한칸앞으로, 패턴은 초기화
            else{
                pt= pt-pp +1; //  한칸 추가
                pp = 0;
            }
        }

        // text 커서에서 패턴 커서를 빼서 인덱스 반환
        if( pp == pat.length()){
            return pt - pp;
        }
        return -1;

    }

}
