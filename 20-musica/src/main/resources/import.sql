INSERT INTO tb_pais (nome) VALUES ('Estados Unidos');
INSERT INTO tb_pais (nome) VALUES ('Brasil');
INSERT INTO tb_pais (nome) VALUES ('Inglaterra');
INSERT INTO tb_pais (nome) VALUES ('Argentina');
INSERT INTO tb_pais (nome) VALUES ('México');

INSERT INTO tb_artista (nome, banda, pais_id) VALUES ('Metallica', true, 1);
INSERT INTO tb_artista (nome, banda, pais_id) VALUES ('Iron Maiden', true, 3);
INSERT INTO tb_artista (nome, banda, pais_id) VALUES ('Pearl Jam', true, 1);
INSERT INTO tb_artista (nome, banda, pais_id) VALUES ('Molotov', true, 5);

INSERT INTO tb_album (titulo, ano, artista_id) VALUES ('Kill ''Em All', 1983, 1);
INSERT INTO tb_album (titulo, ano, artista_id) VALUES ('Ride The Lightning', 1984, 1);
INSERT INTO tb_album (titulo, ano, artista_id) VALUES ('Master Of Puppets', 1986, 1);
INSERT INTO tb_album (titulo, ano, artista_id) VALUES ('... And Justice For All', 1988, 1);
INSERT INTO tb_album (titulo, ano, artista_id) VALUES ('Metallica', 1991, 1);
INSERT INTO tb_album (titulo, ano, artista_id) VALUES ('Load', 1996, 1);
INSERT INTO tb_album (titulo, ano, artista_id) VALUES ('ReLoad', 1997, 1);
INSERT INTO tb_album (titulo, ano, artista_id) VALUES ('Garage Inc', 1998, 1);
INSERT INTO tb_album (titulo, ano, artista_id) VALUES ('St. Anger', 2003, 1);
INSERT INTO tb_album (titulo, ano, artista_id) VALUES ('Death Magnetic', 2008, 1);
INSERT INTO tb_album (titulo, ano, artista_id) VALUES ('Hardwired--- to Self-Desctruct', 2016, 1);

INSERT INTO tb_instrumento (nome, obs) VALUES ('Vocal gutural', 'É um estilo vocal resultante de um conjunto de técnicas vocais que produz um som rouco, grave e/ou profundo, a que se atribui um caráter de agressividade');
INSERT INTO tb_instrumento (nome, obs) VALUES ('Guitarra elétrica', 'As guitarras elétricas surgiram em 1930, como uma modificação do próprio violão');
INSERT INTO tb_instrumento (nome, obs) VALUES ('Violão', 'O violão derivou-se da “Cítar a romana”, tendo seu uso expandindo com a dominação do império romano');
INSERT INTO tb_instrumento (nome, obs) VALUES ('Baixo elétrico', 'Foi só na década de 1930 que o primeiro baixo elétrico foi criado');
INSERT INTO tb_instrumento (nome, obs) VALUES ('Bateria', 'Existem registros de que baterias foram criadas por iranianos há mais de dois milênios atrás');
INSERT INTO tb_instrumento (nome, obs) VALUES ('Teclado', 'Os primeiros teclados surgiram no século III a. C., com os órgãos hidráulicos, na era greco-romana, mas só ganharam importância na civilização ocidental');
INSERT INTO tb_instrumento (nome, obs) VALUES ('Saxofone', 'Ao contrário do que muitos pensam, aprender a tocar saxofone não é difícil');
INSERT INTO tb_instrumento (nome, obs) VALUES ('Clarinete', 'O clarinete é um dos instrumentos de sopro mais bonitos e fáceis de aprender a tocar');
INSERT INTO tb_instrumento (nome, obs) VALUES ('Flauta', 'O instrumento mais comum em todas as casas portuguesas com crianças é a flauta doce, ou de bisel');
INSERT INTO tb_instrumento (nome, obs) VALUES ('Trompete', 'O trompete surgiu em várias culturas há cerca de 3500 anos');

INSERT INTO tb_musico (nome, sobrenome, data_nasc) VALUES ('James', 'Hetfield', '1965-02-25');
INSERT INTO tb_musico (nome, sobrenome, data_nasc) VALUES ('Lars', 'Ulrich', '1969-06-14');

INSERT INTO tb_musico_instrumento (musico_id, instrumento_id) VALUES (1L, 1L);
INSERT INTO tb_musico_instrumento (musico_id, instrumento_id) VALUES (1L, 2L);
INSERT INTO tb_musico_instrumento (musico_id, instrumento_id) VALUES (2L, 5L);