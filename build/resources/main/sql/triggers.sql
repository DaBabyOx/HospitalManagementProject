create or replace function validateReview() returns trigger as $$
begin
    if new.reviewType = 'Doctor' then
    perform 1 from Doctor where idDoctor = new.reviewTId;
    if not found then
        raise exception 'Doctor with id % doesn\'t exist', new.reviewTId;
    end if;

    elsif new.reviewType = 'Hostpital' then
    perofm 1 from Hospital where idHospital = new.reviewTId;
    if not found then
        raise exception 'Hospital with id % doesn\'t exist', new.reviewTId;
    end if;

    else
        raise exception 'no such id.';
    end if;
    return new;
end;
$$ language plpgsql;

create trigger reviewInsertTrigger
before insert or update on Review
for each row execute function validateReview();