create table public.child
(
    c_uuid    uuid not null,
    c_age     integer,
    c_id      varchar(255),
    c_name    varchar(255),
    p_uuid_fk uuid not null,
    primary key (c_uuid)
);
create table public.parent
(
    p_uuid uuid not null,
    p_age  integer,
    p_id   varchar(255),
    p_name varchar(255),
    primary key (p_uuid)
);
create table public.pet
(
    pet_uuid  uuid not null,
    pet_type  varchar(255),
    c_uuid_fk uuid not null,
    primary key (pet_uuid)
);
alter table if exists public.child
    add constraint FK3uuuo4midhi0ga8yfmm3gytud
        foreign key (p_uuid_fk)
            references public.parent;
alter table if exists public.pet
    add constraint FK9ot4vhla01p3ffgtyc7qjws21
        foreign key (c_uuid_fk)
            references public.child;
INSERT INTO parent(p_uuid, p_age, p_id, p_name)
VALUES ('a92ae14b-0605-4f8c-b5a6-4d23af18efa1', 1, 'P111111111', 'P1_NAME');
INSERT INTO parent(p_uuid, p_age, p_id, p_name)
VALUES ('a92ae14b-0605-4f8c-b5a6-4d23af18efa2', 2, 'P222222222', 'P2_NAME');
INSERT INTO parent(p_uuid, p_age, p_id, p_name)
VALUES ('a92ae14b-0605-4f8c-b5a6-4d23af18efa3', 3, 'P333333333', 'P3_NAME');
