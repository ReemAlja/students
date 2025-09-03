package com.wakeb.repository;

import com.wakeb.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // بإمكانك إضافة دوال مخصصة هنا إذا احتجت مثل:
    // Optional<Student> findByEmail(String email);
}
