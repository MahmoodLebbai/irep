/**
 * 
 */
package com.fos.common.emailtemplate.constants;

/**
 * @author mahmoodlebbai
 *
 */
public class NamedQueries {
	
	public static final String LIST_EMAILTEMPLATE_BY_COUNTRY_LANG_TEMPLATE = "select emailTemplate from EmailTemplate et where et.emailTemplateKey.country_code = :countryCode and et.emailTemplateKey.lang_code = :langCode and et.emailTemplateKey.template_id = :templateId and et.status = 1";

}
