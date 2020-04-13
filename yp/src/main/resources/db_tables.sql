use yp;
create table food (id varchar(64) primary key, main_ingredient varchar(128) not null,
food_name varchar(128) not null);

insert into food values (101, 'Potato', 'Aloo Do Pyaaza');
insert into food values (102, 'Cauliflower', 'gobhi aaloo');
insert into food values (103, 'Potato', 'Aloo Paraatha');
insert into food values (104, 'Rice', 'Veg Biryani');
insert into food values (115, 'Idli', 'Idli Saambhar');
insert into food values (106, 'Rice', 'khichdi');
insert into food values (107, 'cauliflower', 'gobhi aaloo');
insert into food values (108, 'okra', 'bhindi do pyaaza');
insert into food values (109, 'red beans', 'raajma');
insert into food values (110, 'check beans', 'amritsari chole');

create table chef(id varchar(32) primary key,
name varchar(128) not null, email varchar(128) not null, about varchar(128));

insert into chef values ('chef_101', 'Rosie', 'r@r.com', "veg chef");
insert into chef values ('chef_102', 'Julie', 'j@j.com', "non veg chef");
insert into chef values ('chef_103', 'Mary', 'm@m.com', "chinese chef");
insert into chef values ('chef_104', 'Annie', 'a@a.com', "mexican chef");
insert into chef values ('chef_105', 'Sophie', 's@s.com', "thai chef");

create table food_chef(id varchar(32) primary key, food_id varchar(32), chef_id varchar(32), price float,
serving varchar(10));
insert into food_chef values ('FC_101', 101, 'chef_101', 5.00, 2);
insert into food_chef values ('FC_102', 101, 'chef_102', 6.00, 3);
insert into food_chef values ('FC_103', 101, 'chef_103', 7.00, 2);
insert into food_chef values ('FC_104', 101, 'chef_102', 8.00, 2);
insert into food_chef values ('FC_105', 101, 'chef_103', 1.00, 4);
insert into food_chef values ('FC_106', 101, 'chef_104', 2.00, 2);
insert into food_chef values ('FC_107', 101, 'chef_105', 4.00, 1);
insert into food_chef values ('FC_108', 101, 'chef_102', 6.00, 2);
insert into food_chef values ('FC_109', 101, 'chef_103', 7.00, 3);
insert into food_chef values ('FC_1010', 101, 'chef_101', 6.00, 2);
insert into food_chef values ('FC_1011', 101, 'chef_105', 9.00, 1);



