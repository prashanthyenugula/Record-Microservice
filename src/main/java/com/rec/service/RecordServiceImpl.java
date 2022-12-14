package com.rec.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rec.entity.Record;

@Service
public class RecordServiceImpl implements IRecordService {
	
	List<Record> list = List.of(
			new Record(1L, "tata@gmail.com", "Tata Motors", 1121L),
			new Record(2L, "mahindra@gmail.com", "Mahindra & Mahindra", 1122L),
			new Record(3L, "cognizant@gmail.com", "Cognizant", 1123L),
			new Record(4L, "accenture@gmail.com", "Accenture", 1124L),
			new Record(5L, "ustglobal@gmail.com", "UST Global", 1125L),
			new Record(6L, "lt@gmail.com", "L&T", 1126L),
			new Record(7L, "infosys@gmail.com", "Infosys", 1127L),
			new Record(8L, "tcs@gmail.com", "TCS", 1128L),
			new Record(9L, "techmahindra@gmail.com", "Tech Mahindra", 1319L)
			
			);

	@Override
	public List<Record> getRecordOfEmployee(Long eId) {
		return list.stream().filter(record -> record.geteId().equals(eId)).collect
				(Collectors.toList());
	}

}
