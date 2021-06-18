package com.github.yukikazescarlet.decorationmod.modelLoader;
import java.util.ArrayList;
import java.util.HashMap;

public class ObjModelStruct {

    public ArrayList<Double> v  = new ArrayList<>(); //頂点座標
    public ArrayList<Double> vt = new ArrayList<>(); // テクスチャ座標
    public ArrayList<Float> vn = new ArrayList<>();   // 法線ベクトル
    public HashMap<String,Integer> hashMap = new HashMap<>();

    public ArrayList<Integer> xv  = new ArrayList<>();   // 頂点 Index の並び
    public ArrayList<Integer> xvt = new ArrayList<>();   // テクスチャ Index の並び
    public ArrayList<Integer> xvn = new ArrayList<>();   // 法線ベクトル Index の並び
}
