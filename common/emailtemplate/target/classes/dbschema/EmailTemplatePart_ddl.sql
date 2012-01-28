    
-- ###########################################
-- # Drop entities
-- ###########################################

-- Many to many relations
    
-- Normal entities
DROP TABLE IF EXISTS EMAIL_TEMPLATE;


-- ###########################################
-- # Create new entities
-- ###########################################

-- Normal entities
    
CREATE TABLE EMAIL_TEMPLATE (
  ID BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  TEMPLATE_FILE_PATH VARCHAR(100) NOT NULL,
  ACTIVE_FLAG CHAR(1) NOT NULL,
  CREATEDDATE TIMESTAMP,
  CREATEDBY VARCHAR(50),
  LASTUPDATED TIMESTAMP,
  LASTUPDATEDBY VARCHAR(50),
  VERSION BIGINT NOT NULL,
  EMAILTEMPLATEKEY_COUNTRY_CODE VARCHAR(2) NOT NULL,
  EMAILTEMPLATEKEY_LANG_CODE VARCHAR(2) NOT NULL,
  EMAILTEMPLATEKEY_TEMPLATE_ID VARCHAR(50) NOT NULL,
  CONSTRAINT UNIQUE (EMAILTEMPLATEKEY_COUNTRY_CODE, EMAILTEMPLATEKEY_LANG_CODE, EMAILTEMPLATEKEY_TEMPLATE_ID)
	

);
  
	
-- Many to many relations

    