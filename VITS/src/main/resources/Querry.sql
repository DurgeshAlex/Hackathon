jdbc:h2:/Users/durgeshkumar/Documents/sts/HotelManagment/VITS/src/main/java/com/wfs/vits/test

create table user( id number,name varchar(40) , password varchar(40) , email varchar(40) ,address varchar(200), ssn varchar(20),phone1 varchar(15) , phone2 varchar(15))ALTER TABLE user ADD COLUMN "id" int NOT NULL  PRIMARY KEY;
ALTER TABLE user ALTER Column "id" INT NOT NULL AUTO_INCREMENT IDENTITY

alter table user add cloumn id Int not null auto_increment primary key
alter table user add primary key ("id");
insert into  user values(1001, 'durgesh','durgesh','durgesh@gmail.com','WFS INdia', 'xyz123456', '9532230744','9515104209');
insert into table user("id","name") values(1001,"durgesh");


create table excel_template( id number,template_name varchar(40) , template_cd varchar(40) ,del_flg BOOLEAN,  created_by number ,created_on TIMESTAMP, updated_by number,updated_on TIMESTAMP );


create table excel_column( id number,column_name varchar(40) , column_display_name varchar(40) ,template_id number, column_sequence number, required Boolean, validation_method varchar(200), data_type varchar(40),default_value varchar(200), created_by number ,created_on TIMESTAMP, updated_by number,updated_on TIMESTAMP );

create table excel_Buffer_Table( buffer_table_id number,sequence_nummber varchar(50) , object BLOB, created_by number ,created_on TIMESTAMP, updated_by number,updated_on TIMESTAMP );
