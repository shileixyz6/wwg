package com.example.wwg.common;/**
 * @Author : xiao
 * @Date : 2020/7/16 9:53
 */

import java.util.Collection;
import java.util.Map;

/**
 * @program: wwg
 * @description: 工具类
 * @author: Mr.Xiao
 * @create: 2020-07-16 09:53
 **/
public class utils {

    public static<K,V> boolean MapEffective(Map<K,V> map){
        return map != null &&  map.size()>0;
    }
    /**
     * 验证集合是否有效，不包括map
     * @param collection
     * @return true有效
     */
    public static<E> boolean CollectionEffective(Collection<E> collection){
        return collection !=null && collection.size()>0;
    }

    /**
     * 验证字符串是否有效
     * @param source 验证字符串
     * @return true为有效，false无效
     */
    public static boolean StringEffective(String source){
        return source != null && source.length()>0;
    }
}
