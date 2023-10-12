package ru.practicum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.practicum.model.Stat;

@Repository
public interface StatsRepository extends JpaRepository<Stat, Long> {

}
