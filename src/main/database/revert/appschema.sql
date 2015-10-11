-- Revert alchemy:appschema from pg

BEGIN;

DROP SCHEMA flipr;

COMMIT;
