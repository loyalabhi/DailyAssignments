import mysql.connector
mydb=mysql.connector.connect(host='localhost',user='root',password='Abhi@2222',database='inventory_management')
print(mydb.connection_id)
cur=mydb.cursor()
cur.execute('create database Inventory_Management')

t='create table manufacure(manufacture_id int,item varchar(30),no_of_items_required int,defective int)'
cur.execute(t)

u='create table goods(goods_id int,item varchar(30),company varchar(30),manufacure_date date)'
cur.execute(u)

r='create table purchase(store_type varchar(30),purchase_id int, purchase_amount int,items varchar(30))'
cur.execute(r)

s='create table sale(store varchar(30),sale_date date,profit_margin float,salesitem varchar(30))'
cur.execute(s)


a='insert into manufacure(manufacture_id,item,no_of_items_required,defective) values(%s,%s,%s,%s)'
z=[(200,'wooden table',2,0),(201,'wooden chair',1,0),(202,'red coloured toys',3,0),(204,'shirt',2,1)]
cur.executemany(a,z)
mydb.commit()

a='insert into goods(goods_id,item,company,manufacure_date) values(%s,%s,%s,%s)'
z=[(300,'wooden table','ss export company','2023-4-1'),(301,'wooden chair','abd company','2023-4-29'),(302,'red coloured toys','xyz company','2023-5-1'),(304,'shirt','bc company','2023-5-1')]
cur.executemany(a,z)
mydb.commit()


a='insert into purchase(store_type,purchase_id,purchase_amount,items)values(%s,%s,%s,%s)'
z=[('offline',400,56000,'wooden table'),('online',401,60000,'wooden chair'),('online',402,10000,'red coloured toys'),('online',403,500,'shirt')]
cur.executemany(a,z)
mydb.commit()


a='insert into sale(store,sale_date,profit_margin,salesitem)values(%s,%s,%s,%s)'
z=[('mycar store','2023-4-2',0.2,'wooden table'),('ab store','2023-5-2',0.1,'wooden chair'),('MYKIDS store','2023-5-2',0.1,'red coloured toys'),('Oray store','2023-5-2',0.1,'shirt')]
cur.executemany(a,z)
mydb.commit()


a='delete from inventory_management.manufacure where defective = 1'
cur.execute(a)
mydb.commit()


a='update manufacure set manufacture_id=700 where sale.store="MYKIDS store"'
cur.execute(a)
mydb.commit()


a="select sale.profit_margin from goods inner join sale on sale.salesitem=goods.item where sale.store='mycar store' and goods.company='ss export company'"
cur.execute(a)
display=cur.fetchall()
print(display)


a='select item from goods where item  like "%wooden chair" and manufacure_date < "2023-5-1" '
cur.execute(a)
display=cur.fetchall()
for x in display:
    print(x)
