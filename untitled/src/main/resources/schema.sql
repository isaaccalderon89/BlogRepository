

-- Inserciones de ejemplo para la tabla Usuario
INSERT INTO Usuario (nombre, email) VALUES
('Usuario1', 'usuario1@example.com'),
('Usuario2', 'usuario2@example.com'),
('Usuario3', 'usuario3@example.com');

-- Inserciones de ejemplo para la tabla Publicacion
INSERT INTO Publicacion (titulo, contenido, fecha_publicacion, usuario_id) VALUES
('Título Publicación 1', 'Contenido de la publicación 1', '2024-02-18 09:00:00', 1),
('Título Publicación 2', 'Contenido de la publicación 2', '2024-02-18 10:30:00', 2),
('Título Publicación 3', 'Contenido de la publicación 3', '2024-02-18 12:45:00', 3);

-- Inserciones de ejemplo para la tabla Comentario
INSERT INTO Comentario (contenido, fecha_comentario, publicacion_id) VALUES
('Comentario en publicación 1', '2024-02-18 10:00:00', 1),
('Comentario en publicación 2', '2024-02-18 11:30:00', 2),
('Comentario en publicación 3', '2024-02-18 14:45:00', 3);

