package com.lmj;

import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;

import java.io.IOException;
import java.io.StringReader;
import java.util.*;

public class Calculate {

    Map<String, int[]> vectorMap = new HashMap<String, int[]>();
    int[] tempArray = null;

    public Calculate() {
    }

    public Calculate(List<String> source, List<String> target) {

        for (String sch : source) {

            if (vectorMap.containsKey(sch)) {

                vectorMap.get(sch)[0]++;
            }
            //将字符转化为向量
            else {

                tempArray = new int[2];
                tempArray[0] = 1;
                tempArray[1] = 0;
                vectorMap.put(sch, tempArray);
            }

        }


        for (String tch : target) {

            if (vectorMap.containsKey(tch)) {

                vectorMap.get(tch)[1]++;
            }
            //将字符转化为向量
            else {

                tempArray = new int[2];
                tempArray[0] = 0;
                tempArray[1] = 1;
                vectorMap.put(tch, tempArray);
            }

        }


    }

    // 求余弦相似度
    public double sim() {
        double result = 0;
        result = pointMulti(vectorMap) / sqrtMulti(vectorMap);
        return result;
    }

    // 求平方和
    public double squares(Map<String, int[]> paramMap) {
        double result1 = 0;
        double result2 = 0;
        Set<String> keySet = paramMap.keySet();
        for (String character : keySet) {
            int temp[] = paramMap.get(character);
            result1 += (temp[0] * temp[0]);
            result2 += (temp[1] * temp[1]);
        }
        return result1 * result2;
    }

    // 点乘法
    public double pointMulti(Map<String, int[]> paramMap) {
        double result = 0;
        Set<String> keySet = paramMap.keySet();
        for (String character : keySet) {
            int temp[] = paramMap.get(character);
            result += (temp[0] * temp[1]);
        }
        return result;
    }

    public double sqrtMulti(Map<String, int[]> paramMap) {
        double result = 0;
        result = squares(paramMap);
        result = Math.sqrt(result);
        return result;
    }

    //分词算法
    public List<String> divide(String article){
        StringReader stringReader = new StringReader(article);
        IKSegmenter ikSegmenter = new IKSegmenter(stringReader, true);
        List<String> list = new ArrayList<>();
        Lexeme lex=null;
        while(true){
            try {
                if (!((lex=ikSegmenter.next())!=null)) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("分词出错");
            }
            String lexemeText = lex.getLexemeText();
            list.add(lexemeText);
        }
        return list;
    }

}

