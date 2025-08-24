create table User(
    idUser serial primary key,
    name varchar(255) not null,
    dateOfBirth date not null,
    gender char(1) not null,
    email varchar(50) not null,
    password text not null,
    address text not null);

create table Patient(
    idPatient serial not null,
    phone varchar(15) not null,
    constraint phoneCheck check (phone ~ '^\+?[1-9][0-9]{7,14}$'),
    allergy text,
    primary key(idPatient),
    foreign key (idPatient) references User(idUser) on delete cascade);

create table Insurance(
    idInsurance serial primary key,
    name varchar(50) not null,
    contactPerson varchar(50) not null,
    phoneNumber varchar(15) not null,
    constraint phoneCheck check (phoneNumber ~ '021[0-9]{6,8}$'));

create table DetailInsurance(
    idInsurance serial not null,
    idPatient serial not null,
    primary key (idInsurance, idPatient),
    foreign key (idInsurance) references Insurance(idInsurance) on delete cascade,
    foreign key (idPatient) references Patient(idPatient) on delete cascade);

create table Doctor(
    idDoctor serial primary key,
    namaDoctor varchar(255) not null,
    photo text, 
    tanggalLahir date not null,
    phone varchar(15) not null,
    constraint phoneCheck check (phone ~ '^\+?[1-9][0-9]{7,14}$'),
    address text not null);

create table Specialty(
    idSpecialty serial primary key,
    specialty varchar(100) primary key);

create table DoctorSpecialty(
    idDoctor serial not null,
    idSpecialty serial not null,
    primary key (idDoctor, idSpecialty),
    foreign key (idDoctor) references Doctor(idDoctor) on delete cascade,
    foreign key (idSpecialty) references Specialty(idSpecialty) on delete cascade);

create table DetailDoctor(
    idDoctor serial not null,
    experience smallint not null check (experience > 0),
    price integer not null check (price > 0),
    onLeave boolean not null,
    foreign key (idDoctor) references Doctor(idDoctor) on delete cascade);

create table Hospital(
    idHospital serial primary key,
    location text not null,
    photo text,
    capacity smallint not null check (capacity > 0),
    services jsonb not null default '{}'::jsonb,
    facilities jsonb not null default '{}':: jsonb);

create table DoctorShift(
    idHospital serial not null,
    idDoctor serial not null,
    shift timestamp not null);

create table Admin(
    idAdmin serial not null,
    namaAdmin varchar(100) not null,
    department varchar(25) not null,
    role varchar (25) not null,
    primary key(idAdmin),
    foreign key (idAdmin) references User(idUser) on delete cascade);

create table Review(
    idReview serial primary key,
    rating smallint not null,
    description text not null
    reviewType varchar(8) not null check (reviewType in ('Doctor', 'Hospital')),
    reviewedId serial not null);

create table Appointment(
    idAppointment serial primary key,
    appointmentDate timestamp default current_date;,
    consultationType varchar(16) not null check (consultationType in ('Konultasi Umum', 'Medical Check Up','Kontrol Ulang')),
    complaints jsonb not null,
    doctorNotes text);