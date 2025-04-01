package ch19_collection;

import java.util.ArrayList;
import java.util.HashSet;

/*
    List는 순서가 있고, 중복을 허용하는 반면,
    Set의 경우 순서는 없고 중복은 허용하지 않기 때문에
    List -> set / 혹은 Set -> List로의 형변환이 중요합니다.
    List를 통해 전체 설문을 받고, Set을 통해 중복을 제거하여
    후보군을 남기는 등의 형태로 많이 사용됩니다.
    또한 Set으로 중복을 제거한 후 ,get(인덱스넘버)로 조회도 가능하겠죠.
 */
public class StrSet {
    //Set 객체 생성
    Set<String> strset = new HashSet<>();
    //List 객체 생성
    List<String> strList = new ArrayList<>();

    //Set에 element 삽입 -> .add()
    strset.add("java");
