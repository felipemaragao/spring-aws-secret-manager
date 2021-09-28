
CREATE TABLE IF NOT EXISTS public.cliente
(
    id serial NOT NULL,
    nome character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT cliente_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE public.cliente
    OWNER to postgres;