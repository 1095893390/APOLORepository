DROP DATABASE IF EXISTS mysar;
CREATE DATABASE mysar;
USE mysar;

CREATE TABLE IF NOT EXISTS config (
  name varchar(255) NOT NULL default '',
  `value` varchar(255) NOT NULL default '',
  UNIQUE KEY name (name)
);


CREATE TABLE IF NOT EXISTS hostnames (
  id bigint(20) unsigned NOT NULL auto_increment,
  ip int(10) unsigned NOT NULL default '0',
  description varchar(50) NOT NULL default '',
  isResolved tinyint(3) unsigned NOT NULL default '0',
  hostname varchar(255) NOT NULL default '',
  PRIMARY KEY  (id),
  KEY isResolved (isResolved),
  KEY ip (ip)
);


CREATE TABLE IF NOT EXISTS trafficSummaries (
  id bigint(20) unsigned NOT NULL auto_increment,
  `date` date NOT NULL default '0000-00-00',
  ip int(10) unsigned NOT NULL default '0',
  usersID bigint(20) unsigned NOT NULL default '0',
  inCache bigint(20) unsigned NOT NULL default '0',
  outCache bigint(20) unsigned NOT NULL default '0',
  sitesID bigint(20) unsigned NOT NULL default '0',
  summaryTime tinyint(3) unsigned NOT NULL default '0',
  PRIMARY KEY  (id),
  UNIQUE KEY date_ip_usersID_sitesID_summaryTime (`date`,ip,usersID,sitesID,summaryTime)
);


CREATE TABLE IF NOT EXISTS traffic (
  id bigint(20) unsigned NOT NULL auto_increment,
  `date` date NOT NULL default '0000-00-00',
  `time` time NOT NULL default '00:00:00',
  ip int(10) unsigned NOT NULL default '0',
  resultCode varchar(50) NOT NULL default '',
  bytes bigint(20) unsigned NOT NULL default '0',
  url text NOT NULL default '',
  authuser varchar(30) NOT NULL default '',
  sitesID bigint(20) unsigned NOT NULL default '0',
  usersID bigint(20) unsigned NOT NULL default '0',
  PRIMARY KEY  (id),
  KEY date_ip_sitesID_usersID (`date`,ip,sitesID,usersID)
);


CREATE TABLE IF NOT EXISTS users (
  id bigint(20) unsigned NOT NULL auto_increment,
  authuser varchar(50) NOT NULL default '',
  `date` date NOT NULL default '0000-00-00',
  PRIMARY KEY  (id),
  UNIQUE KEY date_authuser (`date`,authuser),
  KEY authuser (authuser)
);


CREATE TABLE IF NOT EXISTS sites (
  id bigint(20) unsigned NOT NULL auto_increment,
  `date` date NOT NULL default '0000-00-00',
  site varchar(255) NOT NULL default '',
  PRIMARY KEY  (id),
  UNIQUE KEY date_site (`date`,site)
);