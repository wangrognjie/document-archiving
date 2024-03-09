package com.jeffry.enhancement.document.archiving.worker.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.nio.file.Path;

/**
 * @author ddwrj
 */
@Slf4j
@Component
public class DefaultDocumentArchivingWorker implements DocumentArchivingWorker {

    @Override
    public void scanPath(Path sourcePath) {
        log.info("执行扫描");
    }
}
