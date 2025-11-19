-------------------------------------------------------------
-- LIMPEZA DAS TABELAS (ORDEM CERTA POR CAUSA DAS FKs)
-------------------------------------------------------------

-- Se existir histórico de métricas apontando para app_user
DELETE FROM user_metrics;

-- Limpa tarefas
DELETE FROM task;

-- Limpa usuários
DELETE FROM app_user;

-------------------------------------------------------------
-- USUÁRIO PARA LOGIN
-------------------------------------------------------------
-- login: leonardo@fiap.com
-- senha: 12345678

INSERT INTO app_user (
    id,
    cargo,
    email,
    nome,
    senha
) VALUES (
    1,
    'Operador Mecatronico',
    'leonardo@fiap.com',
    'Leonardo',
    '12345678'
);

-------------------------------------------------------------
-- TAREFAS DO DIA
-------------------------------------------------------------

-- 1) Ergonomia de check-in
INSERT INTO task (titulo, descricao, sugestao_ia, status) VALUES (
    'Ergonomia de check-in',
    'Verifique a postura do operador e o ajuste de altura da bancada.',
    'Ajustar altura da bancada entre 90–100 cm e manter monitor na altura dos olhos.',
    'ACEITO'
);

-- 2) Revisar EPI
INSERT INTO task (titulo, descricao, sugestao_ia, status) VALUES (
    'Revisar EPI',
    'Confirme o uso correto de luvas, óculos e protetor auricular.',
    'Registrar qualquer ausência de EPI e sinalizar para a liderança.',
    'ACEITO'
);

-- 3) Inspeção de rota – braço robô
INSERT INTO task (titulo, descricao, sugestao_ia, status) VALUES (
    'Inspeção de rota – braço robô',
    'Verifique a rota do braço robô, possíveis obstáculos e sensores desalinhados.',
    'Priorizar zonas próximas a operadores e conferir barreiras de segurança.',
    'PENDENTE'
);

-- 4) Inspeção de rota – esteira 1
INSERT INTO task (titulo, descricao, sugestao_ia, status) VALUES (
    'Inspeção de rota – esteira 1',
    'Checar batentes, roletes, sensores de presença e botões de emergência.',
    'Registrar fotos em pontos críticos e ruídos anormais.',
    'PENDENTE'
);

-- 5) Inspeção de rota – esteira 2
INSERT INTO task (titulo, descricao, sugestao_ia, status) VALUES (
    'Inspeção de rota – esteira 2',
    'Inspecionar corrente, roletes e sensores ópticos da esteira 2.',
    'Validar resposta dos botões de emergência e limpeza da área.',
    'PENDENTE'
);

-- 6) Inspeção de rota – esteira 3
INSERT INTO task (titulo, descricao, sugestao_ia, status) VALUES (
    'Inspeção de rota – esteira 3',
    'Ronda completa na esteira 3 verificando proteções e sinalizações.',
    'Aplicar checklist digital e registrar qualquer vibração anormal.',
    'PENDENTE'
);
