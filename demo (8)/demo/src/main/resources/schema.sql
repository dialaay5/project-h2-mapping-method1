CREATE TABLE book (
    id int auto_increment,
    title varchar(255) NOT NULL,
    pages int NOT NULL,
    author varchar(255) NOT NULL,
    price int NOT NULL,
    PRIMARY KEY (id)
    );


    CREATE TABLE orders (
        id int auto_increment,
        item varchar(255) NOT NULL,
        customer varchar(255) NOT NULL,
        price int NOT NULL,
        amount int NOT NULL,
        datee DATE NOT NULL,
        PRIMARY KEY (id)
        );