package br.com.sisnema.banco.controllers.TI;

import br.com.sisnema.banco.dtos.FuncaoDto;
import br.com.sisnema.banco.factories.Factory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
public class FuncaoControllerTestsTI {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    private Long idExistente;
    private Long idNaoExistente;

    @BeforeEach
    void Setup() throws Exception {
        idExistente = 1L;
        idNaoExistente = 999L;
    }

    @Test
    public void procurarTodosDeveriaRetornarUmaListaDeDtos() throws Exception {
        ResultActions resultado = mockMvc.perform(
                get("/v1/funcoes")
                .accept(MediaType.APPLICATION_JSON)
        );

        resultado.andExpect(status().isOk());
    }

    @Test
    public void procurarPorIdDeveriaRetornarUmDtoQuandoOIdExistir() throws Exception {
        ResultActions resultado = mockMvc.perform(
                get("/v1/funcoes/{id}", idExistente)
                        .accept(MediaType.APPLICATION_JSON)
        );

        resultado.andExpect(status().isOk());
    }

    @Test
    public void procurarPorIdDeveriaRetornarUm404QuandoOIdNaoExistir() throws Exception {
        ResultActions resultado = mockMvc.perform(
                get("/v1/funcoes/{id}", idNaoExistente)
                        .accept(MediaType.APPLICATION_JSON)
        );

        resultado.andExpect(status().isNotFound());
    }

    @Test
    public void inserirDeveriaRetornarUmObjetoDto() throws Exception {

        FuncaoDto dto = Factory.criarFuncaoDto();
        String jsonBody = objectMapper.writeValueAsString(dto);

        ResultActions resultado = mockMvc.perform(
                post("/v1/funcoes")
                .content(jsonBody)
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
        );

        resultado.andExpect(status().isCreated());
        resultado.andExpect(jsonPath("$.id").exists());
        resultado.andExpect(jsonPath("$.autoridade").exists());
    }

    @Test
    public void atualizarDeveriaRetornarUmObjetoDto() throws Exception {

        FuncaoDto dto = Factory.criarFuncaoDto();
        String jsonBody = objectMapper.writeValueAsString(dto);

        ResultActions resultado = mockMvc.perform(
                put("/v1/funcoes/{id}", idExistente)
                        .content(jsonBody)
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
        );

        resultado.andExpect(status().isOk());
        resultado.andExpect(jsonPath("$.id").exists());
        resultado.andExpect(jsonPath("$.autoridade").exists());
    }

    @Test
    public void atualizarDeveriaRetornarUm404IdNaoExistente() throws Exception {

        FuncaoDto dto = Factory.criarFuncaoDto();
        String jsonBody = objectMapper.writeValueAsString(dto);

        ResultActions resultado = mockMvc.perform(
                put("/v1/funcoes/{id}", idNaoExistente)
                        .content(jsonBody)
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
        );

        resultado.andExpect(status().isNotFound());
    }

    @Test
    public void excluirDeveriaRetornarUm204QuandoOIdExistir() throws Exception {
        ResultActions resultado = mockMvc.perform(
                delete("/v1/funcoes/{id}", idExistente)
                .accept(MediaType.APPLICATION_JSON)
        );

        resultado.andExpect(status().isNoContent());
    }

    @Test
    public void excluirDeveriaRetornarUm404QuandoOIdNaoExistir() throws Exception {
        ResultActions resultado = mockMvc.perform(
                delete("/v1/funcoes/{id}", idNaoExistente)
                        .accept(MediaType.APPLICATION_JSON)
        );

        resultado.andExpect(status().isNotFound());
    }

}
