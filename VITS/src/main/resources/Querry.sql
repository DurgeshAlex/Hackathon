jdbc:h2:/Users/durgeshkumar/Documents/sts/HotelManagment/VITS/src/main/java/com/wfs/vits/test

create table user( id number,name varchar(40) , password varchar(40) , email varchar(40) ,address varchar(200), ssn varchar(20),phone1 varchar(15) , phone2 varchar(15))ALTER TABLE user ADD COLUMN "id" int NOT NULL  PRIMARY KEY;
ALTER TABLE user ALTER Column "id" INT NOT NULL AUTO_INCREMENT IDENTITY

alter table user add cloumn id Int not null auto_increment primary key
alter table user add primary key ("id");
insert into  user values(1001, 'durgesh','durgesh','durgesh@gmail.com','WFS INdia', 'xyz123456', '9532230744','9515104209');
insert into table user("id","name") values(1001,"durgesh");


create table exceltemplate( id number,templatename varchar(40) , templatecd varchar(40) ,delflg BOOLEAN,  createdby number ,createdon TIMESTAMP, updatedby number,updatedon TIMESTAMP );


create table excelcolumn( id number,columnname varchar(40) , columndisplayname varchar(40) ,templateid number, columnsequence number, required Boolean, validationmethod varchar(200), datatype varchar(40),defaultvalue varchar(200), createdby number ,createdon TIMESTAMP, updatedby number,updatedon TIMESTAMP );

create table excelbuffertable( buffer_table_id number,sequence_nummber varchar(50) , object BLOB, created_by number ,created_on TIMESTAMP, updated_by number,updated_on TIMESTAMP );

Insert into exceltemplate( id,templatename, templatecd ,delflg) values(1001,'user_template', 'usertemplate',false );
insert into excelcolumn( id ,columnname  , columndisplayname  ,templateid , columnsequence , required) values(1,'name','Name',1001,1,true);
insert into excelcolumn( id ,columnname  , columndisplayname  ,templateid , columnsequence , required) values(2,'password','Password',1001,2,true);
insert into excelcolumn( id ,columnname  , columndisplayname  ,templateid , columnsequence , required) values(3,'email','Email',1001,3,true);
insert into excelcolumn( id ,columnname  , columndisplayname  ,templateid , columnsequence , required) values(4,'phone1','Primary Number',1001,4,true);
insert into excelcolumn( id ,columnname  , columndisplayname  ,templateid , columnsequence , required) values(5,'phone2','Alternate Number',1001,5,true);
insert into excelcolumn( id ,columnname  , columndisplayname  ,templateid , columnsequence , required) values(6,'address','Address',1001,6,true);
insert into excelcolumn( id ,columnname  , columndisplayname  ,templateid , columnsequence , required) values(7,'ssn','SSN',1001,7,true);