CREATE SCHEMA IF NOT EXISTS demo;
SET SCHEMA demo;
DROP TABLE IF EXISTS  flights;
CREATE TABLE flights (
        flights_seq INTEGER PRIMARY KEY AUTO_INCREMENT UNIQUE,
        carrier_code VARCHAR(100) UNIQUE,
        number INTEGER,
        flight_date TIMESTAMP,
        origin VARCHAR(100),
        destination VARCHAR(100)
    );

INSERT INTO flights (carrier_code, number, flight_date, origin, destination) VALUES ('CX811', 7011, '2023-12-01 00:30:00', 'NTGA', 'SMCA');
INSERT INTO flights (carrier_code, number, flight_date, origin, destination) VALUES ('B61023', 4200, '2023-12-01 04:15:00', 'FAMD', 'SVAN');
INSERT INTO flights (carrier_code, number, flight_date, origin, destination) VALUES ('NK1007', 5566, '2023-12-01 06:00:00', 'YARY', 'EKAH');
INSERT INTO flights (carrier_code, number, flight_date, origin, destination) VALUES ('WN409', 7863, '2023-12-01 09:05:00', 'OEBA', 'YMAY');
INSERT INTO flights (carrier_code, number, flight_date, origin, destination) VALUES ('DL2737', 6527, '2023-12-01 12:10:00', 'EGPD', 'DIAP');