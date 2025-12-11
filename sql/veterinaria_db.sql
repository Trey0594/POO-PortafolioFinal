CREATE TABLE cliente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    apellidos VARCHAR(50),
    cedula VARCHAR(20),
    sexo CHAR(1),
    ubicacion VARCHAR(100)
);

CREATE TABLE mascota (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    especie VARCHAR(50),
    raza VARCHAR(50),
    edad INT,
    id_cliente INT,
    FOREIGN KEY (id_cliente) REFERENCES cliente(id)
);

CREATE TABLE veterinario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    apellidos VARCHAR(50),
    cedula VARCHAR(20),
    sexo CHAR(1),
    especialidad VARCHAR(100)
);

CREATE TABLE cita (
    id INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE,
    motivo VARCHAR(200),
    id_mascota INT,
    id_veterinario INT,
    FOREIGN KEY (id_mascota) REFERENCES mascota(id),
    FOREIGN KEY (id_veterinario) REFERENCES veterinario(id)
);
