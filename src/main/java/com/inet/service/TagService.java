package com.inet.service;

import com.inet.po.Tag;
import com.inet.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TagService {
    Tag saveTag(Tag tag);

    Tag getTag(Long id);

    Tag getTagByName(String name);

    List<Tag> listTag();

    Page<Tag> listTag(Pageable pageable);

    Tag updateType(Long id, Tag tag);

    void deleteTag(Long id);
}
