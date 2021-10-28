--clients

INSERT INTO public.clients (identification, email, id, "name") VALUES('1010239900', 'persona1@gmail.com', 0, 'persona1');
INSERT INTO public.clients (identification, email, id, "name") VALUES('1010243260', 'persona2@gmail.com', 1, 'persona2');
INSERT INTO public.clients (identification, email, id, "name") VALUES('1234567890', 'persona3@gmail.com', 2, 'persona3');
INSERT INTO public.clients (identification, email, id, "name") VALUES('9876543210', 'persona4@gmail.com', 3, 'persona4');

select * from public.clients; 

--creditcards

INSERT INTO public.credit_cards("number", bank, brand, cvc, valid_thru, owner_id) VALUES('9090-9009-9090-9999', 'Bancolombia', 'VISA', '123', '08-24', '1010243260');
INSERT INTO public.credit_cards("number", bank, brand, cvc, valid_thru, owner_id) VALUES('7363-3333-1111-9827', 'Bancolombia', 'VISA', '123', '08-24', '1010243260');
INSERT INTO public.credit_cards("number", bank, brand, cvc, valid_thru, owner_id) VALUES('8272-9009-9090-9999', 'BBVA', 'VISA', '123', '08-24', '1010243260');
INSERT INTO public.credit_cards("number", bank, brand, cvc, valid_thru, owner_id) VALUES('2828-9009-9090-9999', 'Scotiabank', 'VISA', '123', '08-24', '1010243260');
INSERT INTO public.credit_cards("number", bank, brand, cvc, valid_thru, owner_id) VALUES('1111-1111-1111-1111', 'Bancolombia', 'VISA', '123', '08-24', '1010243260');
INSERT INTO public.credit_cards("number", bank, brand, cvc, valid_thru, owner_id) VALUES('9090-9009-9090-0020', 'BBVA', 'VISA', '123', '08-24', '1010243260');
INSERT INTO public.credit_cards("number", bank, brand, cvc, valid_thru, owner_id) VALUES('9090-9009-9090-0238', 'ITAU', 'VISA', '123', '08-24', '1010243260');
INSERT INTO public.credit_cards("number", bank, brand, cvc, valid_thru, owner_id) VALUES('9090-9009-9091-6242', 'Bancolombia', 'VISA', '123', '08-24', '1010239900');
INSERT INTO public.credit_cards("number", bank, brand, cvc, valid_thru, owner_id) VALUES('9090-9009-9093-9999', 'Bancolombia', 'VISA', '123', '08-24', '1010239900');
INSERT INTO public.credit_cards("number", bank, brand, cvc, valid_thru, owner_id) VALUES('9090-9009-8376-9999', 'Bancolombia', 'VISA', '123', '08-24', '1234567890');
INSERT INTO public.credit_cards("number", bank, brand, cvc, valid_thru, owner_id) VALUES('9090-8009-9090-9999', 'Bancolombia', 'VISA', '123', '08-24', '1010243260');
INSERT INTO public.credit_cards("number", bank, brand, cvc, valid_thru, owner_id) VALUES('9090-8980-9090-9999', 'Bancolombia', 'VISA', '123', '08-24', '1010239900');

select * from public.credit_cards; 