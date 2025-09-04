PRAGMA foreign_keys = ON;

CREATE TABLE participante (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nome TEXT NOT NULL,
    email TEXT NOT NULL UNIQUE,
    telefone TEXT

);

CREATE TABLE evento (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nome TEXT NOT NULL,
    local TEXT NOT NULL,
    data TEXT NOT NULL,
    descricao TEXT

);

CREATE TABLE pagamento (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    id_inscricao INTEGER NOT NULL UNIQUE,
    data_pagamento TEXT,
    valor REAL NOT NULL CHECK (valor >= 0),
    status TEXT,
    FOREIGN KEY (id_inscricao) REFERENCES inscricao(id) ON DELETE CASCADE

);

CREATE TABLE inscricao (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    id_evento INTEGER NOT NULL UNIQUE,
    id_Participante INTEGER NOT NULL UNIQUE,
    data_incricao TEXT NOT NULL,
    status TEXT,
    FOREIGN KEY (id_evento) REFERENCES evento(id) ON DELETE CASCADE,
    FOREIGN KEY (id_participante) REFERENCES participante(id) ON DELETE CASCADE

);

-- Iserir participante
INSERT INTO participante (nome, email, telefone ) VALUES ('bruno','Bruno@gmail.com','40028922');

INSERT INTO participante (nome, email, telefone ) VALUES ('Rafael','rafael@gmail.com','12345678');

INSERT INTO participante (nome, email, telefone ) VALUES ('Joao','joao@gmail.com','00042234');

-- Inserir evento 

INSERT INTO evento (nome, local, data, descricao ) VALUES ('Comemoração','Bem ali','11/09/2002','n/a');

INSERT INTO evento (nome, local, data, descricao ) VALUES ('Baile do jaca','Ali na esquerda','09/11/2002','n/a');

INSERT INTO evento (nome, local, data, descricao ) VALUES ('UFC Rio','Vai ali, vira la e entra pra la','02/09/2011','n/a');

--Inserir inscricao

INSERT INTO inscricao (id_evento, id_participante, status, data_incricao ) VALUES ('1','1','11/09/2002','Confirmada');

INSERT INTO inscricao (id_evento, id_participante, status, data_incricao ) VALUES ('2','2','10/09/2002','Confirmada');

INSERT INTO inscricao (id_evento, id_participante, status, data_incricao ) VALUES ('3','3','20/08/2011','Confirmada');

--Inseri pagamento 

INSERT INTO pagamento (id_inscricao, valor, data_pagamento, status ) VALUES ('1','100','11/09/2002','Confirmada');

INSERT INTO pagamento (id_inscricao, valor, data_pagamento, status ) VALUES ('2','100','11/092002','Confirmada');

INSERT INTO pagamento (id_inscricao, valor, data_pagamento, status ) VALUES ('3','120','21/0/2011','Confirmada');



