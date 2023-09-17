package hanium.englishfairytale.tale.infra.http;

import hanium.englishfairytale.tale.infra.http.dto.request.TaleCreateDto;
import hanium.englishfairytale.tale.infra.http.dto.response.TaleCreateResponse;
import hanium.englishfairytale.tale.application.TaleCommandService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/fairytale")
@RequiredArgsConstructor
public class TaleController {
    private final TaleCommandService taleService;

    @PostMapping("/create")
    public ResponseEntity<TaleCreateResponse> create(@RequestBody TaleCreateDto taleCreateDto){
        return new ResponseEntity<>(taleService.create(taleCreateDto), HttpStatus.OK);
    }
}
