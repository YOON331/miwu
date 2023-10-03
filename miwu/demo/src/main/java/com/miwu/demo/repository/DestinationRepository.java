package com.miwu.demo.repository;

// Destination 엔티티
// 엔티티: 데이터베이스 테이블과 매핑되는 클래스
import com.miwu.demo.entity.Destination;
// 간단히 DB에 Create/Read/Update/Delete 쿼리 수행을 가능토록 함
import org.springframework.data.jpa.repository.JpaRepository;
// 리스트
import java.util.List;

public interface DestinationRepository extends JpaRepository<Destination, Long> {
    @Override
    List<Destination> findAll(); // 조건없이 테이블의 전체 레코드 조회

    void deleteAllInBatch(); // 조건없이 테이블의 전체 레코드 삭제
}