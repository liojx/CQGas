package com.cqgas.tools.util;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import flow.JMcust;

public class TextUtil {
	private static final Logger logs = Logger.getLogger(TextUtil.class);
	public static String Html2Text(String inputString) {
		String htmlStr = inputString; // ��html��ǩ���ַ�
		String textStr = "";
		java.util.regex.Pattern p_script;
		java.util.regex.Matcher m_script;
		java.util.regex.Pattern p_style;
		java.util.regex.Matcher m_style;
		java.util.regex.Pattern p_html;
		java.util.regex.Matcher m_html;

		try {
			String regEx_script = "<[\\s]*?script[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?script[\\s]*?>"; // ����script��������ʽ{��<script[^>]*?>[\\s\\S]*?<\\/script>
			// }
			String regEx_style = "<[\\s]*?style[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?style[\\s]*?>"; // ����style��������ʽ{��<style[^>]*?>[\\s\\S]*?<\\/style>
			// }
			String regEx_html = "<[^>]+>"; // ����HTML��ǩ��������ʽ

			p_script = Pattern.compile(regEx_script, Pattern.CASE_INSENSITIVE);
			m_script = p_script.matcher(htmlStr);
			htmlStr = m_script.replaceAll(""); // ����script��ǩ

			p_style = Pattern.compile(regEx_style, Pattern.CASE_INSENSITIVE);
			m_style = p_style.matcher(htmlStr);
			htmlStr = m_style.replaceAll(""); // ����style��ǩ

			p_html = Pattern.compile(regEx_html, Pattern.CASE_INSENSITIVE);
			m_html = p_html.matcher(htmlStr);
			htmlStr = m_html.replaceAll(""); // ����html��ǩ

			textStr = htmlStr;

		} catch (Exception e) {
			System.err.println("Html2Text: " + e.getMessage());
		}

		return textStr;// �����ı��ַ�
	}

	public static String replaceBlank(String source) {
		Pattern p = Pattern.compile("\\s*|\t|\r|\n");
		System.out.println("before:" + source);
		Matcher m = p.matcher(source);
		String after = m.replaceAll("");
		System.out.println("after:" + after);
		return after;
	}

	private static void byte2hex(byte b, StringBuffer buf) {
		char[] hexChars = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'A', 'B', 'C', 'D', 'E', 'F' };
		int high = ((b & 0xf0) >> 4);
		int low = (b & 0x0f);
		buf.append(hexChars[high]);
		buf.append(hexChars[low]);
	}

	public static String toHexStr(byte[] t, int start, int end) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < t.length; i++) {
			if (start <= i && end >= i) {
				if (t[i] != 0) {
					byte2hex(t[i], sb);
					sb.append(" ");
				}
			}
		}
		return sb.toString();
	}

	/**
	 * Splits the string on every token into an array of stack frames.
	 * 
	 * @param string
	 *            the string
	 * @param onToken
	 *            the token
	 * @return the resultant array //@deprecated This is an internal utility
	 *         method that should not be used
	 */
	public static String[] splitString(String string, String onToken) {
		if (string == null)
			return null;
		final StringTokenizer tokenizer = new StringTokenizer(string, onToken);
		final String[] result = new String[tokenizer.countTokens()];

		for (int i = 0; i < result.length; i++) {
			result[i] = tokenizer.nextToken();
		}

		return result;
	}

	public static String getWebModulPath() {
		String ret = getWebinfPath();
		int cnt = ret.indexOf("/WEB-INF");
		if (cnt > -1)
			ret = ret.substring(0, cnt);
		return ret;
	}

	private static String _webinfPath = null;

	public static String getWebinfPath() {
		if (_webinfPath == null) {
			String res = null;
			TextUtil u = new TextUtil();
			String classname = u.getClass().getName().replace('.', '/')
					+ ".class";
			ClassLoader cl = u.getClass().getClassLoader();
			if (cl != null) {
				java.net.URL url = cl.getResource(classname);
				if (url != null) {
					String path = url.getFile();
					int fileStrPosition = path.indexOf("file:/");
					int begin = 0;
					int end = path.length();

					if (fileStrPosition >= 0)
						begin = fileStrPosition + 5;

					// ���ж��Ƿ���δ����ļ�

					end = path.indexOf("classes/" + classname);
					if (end < 0) {
						// �������webModule�����jar��

						end = path.indexOf("lib/");
						if (end < 0) {
							// ����ͨĿ¼�µ�jar��

							int tmpend = path.indexOf("!/");
							end = path.substring(0, tmpend).lastIndexOf("/");
						}
					}
					String rf = path.substring(begin, end);
					res = new File(rf).getAbsolutePath().replace('\\', '/')
							+ "/";
				}
			}
			try {
				_webinfPath = java.net.URLDecoder.decode(res, "UTF-8");
			} catch (UnsupportedEncodingException ex) {
			}
		}
		return _webinfPath;
	}

	private static String _systemPath = null;

	public static String getSystemPath() {
		if (_systemPath == null) {
			String res = getWebinfPath();
			if (res.indexOf("WEB-INF/") > 0 && res.length() > 10) {
				res = res.substring(0, res.lastIndexOf("/", res.length() - 12))
						+ "/";
			}
			_systemPath = res;
			System.out.println("System Path=" + _systemPath);
		}
		return _systemPath;
	}
	public static String updateUUI(String uui,String key ,String value){
		String newUUI = "";
		if(uui!=null){
			String[] arrys = uui.split("\\|");
			Map<String,String> map = new HashMap<String,String>();
			for(int i=0;i<arrys.length;i++){
				if(key.equals(arrys[i].split("=")[0].trim())){
					map.put(key, value);
				}else{
					map.put(arrys[i].split("=")[0], arrys[i].split("=")[1]);
				}
			}
			int i=0;
			for (String key2 : map.keySet()) {
				if(i==0){
					newUUI= newUUI+key2+"="+ map.get(key2);
				}else{
					newUUI = newUUI+"|"+key2+"="+ map.get(key2);
				}
				i++;
			 }

		}
		if("".equals(newUUI)){
			return uui;
		}else{
			return newUUI;
		}
		
	}
	public static Map<String,String> toMapForUUI(String uui){
		if(StringUtils.isNotEmpty(uui)){
			String[] arrys = uui.split("\\|");
			Map<String,String> map = new HashMap<String,String>();
			for(int i=0;i<arrys.length;i++){
				if(arrys[i].indexOf("~")>-1){
					String[] as = arrys[i].split("~");
					if(as.length==2){
						map.put(arrys[i].split("~")[0].trim(), arrys[i].split("~")[1].trim());
					}else{
						map.put(arrys[i].split("~")[0].trim(), "");
					}
				}
			}
			return map;
		}else{
			return null;
		}
	}
	public static String fromatUUIFromMap(Map<String,String> map){
		int i=0;
		String newUUI="";
		for (String key : map.keySet()) {
			if(i==0){
				newUUI= newUUI+key+"~"+ map.get(key);
			}else{
				newUUI = newUUI+"|"+key+"~"+ map.get(key);
			}
			i++;
		 }
		return newUUI;
	}

	 public static String getMoney(double v) {
			String UNIT = "万千佰拾亿千佰拾万千佰拾元角分";
			 String DIGIT = "零壹贰叁肆伍陆柒捌玖";
			double MAX_VALUE = 9999999999999.99D;
	  if (v < 0 || v > MAX_VALUE){
		  return "参数非法!";
	  }
	  long l = Math.round(v * 100);
	  if (l == 0){
		  return "零元整";
	  }
	  String strValue = l + "";
	  // i用来控制数
	  int i = 0;
	  // j用来控制单位
	  int j = UNIT.length() - strValue.length();
	  String rs = "";
	  boolean isZero = false;
	  for (; i < strValue.length(); i++, j++) {
	   char ch = strValue.charAt(i);
	   if (ch == '0') {
	    isZero = true;
	    if (UNIT.charAt(j) == '亿' || UNIT.charAt(j) == '万' || UNIT.charAt(j) == '元') {
	     rs = rs + UNIT.charAt(j);
	     isZero = false;
	    }
	   } else {
	    if (isZero) {
	     rs = rs + "零";
	     isZero = false;
	    }
	    rs = rs + DIGIT.charAt(ch - '0') + UNIT.charAt(j);
	   }
	  }
	  if (!rs.endsWith("分")) {
	   rs = rs + "";
	  }
	  rs = rs.replaceAll("亿万", "亿");
	  logs.debug(rs);
	  String rs2 = "";
	  int pre = rs.indexOf("元");
		  if(pre>0){
		  String str_pre = rs.substring(0,pre);
		  for(int k=0;k<str_pre.length();k++){
			  if((k+1)%2==0){
				  rs2 =rs2+rs.charAt(k)+",";
			  }else{
				  rs2 +=rs.charAt(k);
			  }
		  }
		  rs2=rs2+"元,";
		  String str_end = rs.substring(pre+1, rs.length());
		  for(int m=0;m<str_end.length();m++){
			  if((m+1)%2==0){
				  rs2 =rs2+str_end.charAt(m)+",";
			  }else{
				  rs2 +=str_end.charAt(m);
			  }
		  }
		  logs.debug(rs2);
		  return rs2;
		  }
		  
	  return rs;
	 }
}
