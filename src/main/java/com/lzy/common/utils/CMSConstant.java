package com.lzy.common.utils;

public class CMSConstant {
	
	public static final String LZY_CMS_ARTICLE_KAFKA ="lzy_cms_article_key_";
	
	
	
	//定义栏目的list的key
	public static final String LZY_CMS_USER_LOGIN ="lzy_cms_user";
	public static final String LZY_CMS_USER_LOGIN_KEY ="lzy_cms_user_key_";

	//ctrl+shift+x 变大写     ctrl+shift+y变小写
		//定义栏目的list的key
		public static final String REDIS_KEY_CHANNEL_LIST ="lzy_cms_channel_list";
		
		//定义栏目的hash的key
		public static final String REDIS_KEY_CHANNEL_HASH ="lzy_cms_channel_hash";   
		//定义栏目的hash中字段的key的前缀
		public static final String REDIS_KEY_CHANNEL_HASH_KEY ="lzy_cms_channel_hash_key_";   
	// 用户的角色
	public static final Integer CMS_ROLE_ADMIN    = 0;
	public static final Integer CMS_ROLE_GENERAL  = 1;
	
	public static final Integer CMS_LOCKED_TRYE   = 0;
	public static final Integer CMS_LOCKED_FALSE  = 1;
	
	public static final Integer ARTICLE_STATUS_NEW=0;// 文章刚发布
	public static final Integer ARTICLE_STATUS_CHECKED=1;// 文章已审核
	public static final Integer ARTICLE_STATUS_UNCHECKED=-1;// 文章未审核通过
	
	public static final String CMS_LOGIN_ADMIN="LOGIN_ADMIN";
	public static final String CMS_LOGIN_GENERAL="LOGIN_GENERAL";
	
	public static final String URL_LOGIN_ADMIN="/admin";
	public static final String URL_LOGIN_GENERAL="/my";
	
	
}
