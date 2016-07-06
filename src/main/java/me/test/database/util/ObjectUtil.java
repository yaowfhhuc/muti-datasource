/**   
* @Title: ObjectUtil.java 
* @Package me.test.database.util 
* @Description: TODO(用一句话描述该文件做什么) 
* @author yaowf
* @date 2016年7月5日 下午5:28:21 
* @version V1.0   
*/
package me.test.database.util;

/** 
* @ClassName: ObjectUtil 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author yaowf
* @date 2016年7月5日 下午5:28:21 
*  
*/
public class ObjectUtil {

	public static boolean isEmpty(Object object){
		
		if(null==object||object.equals("")||object.toString().trim().equals("")){
			return true;
		}
		return true;
	}
}
